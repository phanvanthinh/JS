package controller;



import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.UserService;
import service.UserServiceImpl;
import user.user;


/**
 * Servlet implementation class helloSevlet
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       UserService userService = new UserServiceImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             
    	
    	System.out.println("hihihi");
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		UserService userService = new UserServiceImpl();
		String user = request.getParameter("username");
		String pass = request.getParameter("password");
		user us = userService.findUserByIdAndPassword(user, pass);
		
		
		
		if (us != null) {	
			HttpSession session = request.getSession();
			session.setAttribute("username", us);
			session.setAttribute("role", us.getRole());
			RequestDispatcher rq = request.getRequestDispatcher("admin");
		    rq.forward(request, response);
			
//			if(us.getRole()==1) {
//				RequestDispatcher rq = request.getRequestDispatcher("admin");
//			    rq.forward(request, response);
//			}else {
//				response.sendRedirect("loginOk.jsp");
//			   
//			}
			
		} else {response.sendRedirect("loginFaill.jsp");}
		
		
//		String name = request.getParameter("username");
//		String pass = request.getParameter("password");
//		try {
//			List<user> lstUser = userService.findAll();
//			Boolean checkUser = false;
//			for(user u: lstUser ) {
//				if(u.getUsername().equalsIgnoreCase(name)&& u.getPassword().equalsIgnoreCase(pass)) {
//					checkUser = true;
//					break;
//				}u
//			}
//			user us = new user();
//			us.setUsername(name);
//			request.getSession().setAttribute("key1", us);
//			if(checkUser) {
//				RequestDispatcher rq = request.getRequestDispatcher("loginOk.jsp");
//				rq.forward(request, response);
//			}else {
//				response.sendRedirect("loginFaill.jsp");
//			}
//			
//			
//			Boolean checkUserLogin = userService.findUserByIdAndPassword(name, pass);
			
			//******
//			user us = new user();
//			us.setUsername(name);
//			request.getSession().setAttribute("key1", us);
//			if(checkUserLogin) {
//				RequestDispatcher rq = request.getRequestDispatcher("loginOk.jsp");
//				rq.forward(request, response);
//			}else {
//				response.sendRedirect("loginFaill.jsp");
//			}
			//******
//			user us = new user();
//			us.setUsername(name);
//			request.getSession().setAttribute("key1", us);
//			if (name.equals("thinh") && pass.equals("12345")){
//				RequestDispatcher rq = request.getRequestDispatcher("loginOk.jsp");
//				rq.forward(request, response);
//				
//			}
//			else {
//				response.sendRedirect("loginFaill.jsp");
//			}
			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//		}

//		user us = new user();
//		us.setUsername(name);
//		request.getSession().setAttribute("key1", us);
//		if (name.equals("thinh") && pass.equals("12345")){
//			RequestDispatcher rq = request.getRequestDispatcher("loginOk.jsp");
//			rq.forward(request, response);
//			
//		}
//		else {
//			response.sendRedirect("loginFaill.jsp");
//		}
	}

}
