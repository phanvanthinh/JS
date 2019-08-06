package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileUploadException;
import org.apache.tomcat.util.http.fileupload.RequestContext;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import service.UserService;
import service.UserServiceImpl;
import user.user;
import java.io.File;

/**
 * Servlet implementation class AddUserController
 */
@WebServlet("/addUser")
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     RequestDispatcher rd = request.getRequestDispatcher("addUser.jsp");
	     rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		String ava = request.getParameter("avatar");
		String rl = request.getParameter("role");
		int role =Integer.parseInt(rl);
		
		
		
		user us = new user();
		us.setUsername(name);
		us.setPassword(pass);
		us.setAvatar(ava);
		us.setRole(role);
	
		
		UserService usersevice = new UserServiceImpl();
	    usersevice.addUser(us);
		response.sendRedirect("admin");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
//		ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
//		
//		user us = new user();
//		List<FileItem> items;
//		
//		try {
//			items = servletFileUpload.parseRequest(request);
//			for (FileItem item : items) {
//				if (item.getFieldName().equals("username")) {
//					us.setUsername(item.getString());
//				}else if (item.getFieldName().equals("password")) {
//					us.setPassword(item.getString());
//				}else if (item.getFieldName().equals("avatar")) {
//					if (item.getSize() > 0) {
//						final String dir = "D:\\IMEG";
//						String originalFileName = item.getName();
//						int index = originalFileName.lastIndexOf(".");
//						String ext = originalFileName.substring(index +1);
//						String fileName = System.currentTimeMillis() + "." + ext;
//						File file = new File(dir + "/" + fileName);
//						item.write(file);
//						us.setAvatar(fileName);
//					}else {
//						us.setAvatar(null);
//					}
//				}
//				
//			}
//			
//		} catch (FileUploadException e) {
//			e.printStackTrace();
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		UserService usersevice = new UserServiceImpl();
//		usersevice.addUser(us);
//		
//		response.sendRedirect("admin");
//		
//		
}

}
