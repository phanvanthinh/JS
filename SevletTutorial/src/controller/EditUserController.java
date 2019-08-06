package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;
import user.user;

/**
 * Servlet implementation class EditUserController
 */
@WebServlet("/editUser")
public class EditUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
	
	
		
		int stt = Integer.parseInt(request.getParameter("stt"));
		System.out.println("STT : ----->" + stt);
		UserService userService = new UserServiceImpl();
		user us = userService.findUserByStt(stt);
		request.setAttribute("us", us);
		
		RequestDispatcher rd = request.getRequestDispatcher("editUser.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int stt = Integer.parseInt(request.getParameter("stt"));
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String avatar = request.getParameter("avatar");
		user us = new user();
		us.setStt(stt);
		us.setUsername(username);
		us.setPassword(password);
		us.setAvatar(avatar);
		UserService userService = new UserServiceImpl();
		userService.editUser(us);
		response.sendRedirect("admin");
	}

}
