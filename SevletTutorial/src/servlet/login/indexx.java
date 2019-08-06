package servlet.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/indexx")
public class indexx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public indexx() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		String name = request.getParameter("username");
		String pass = request.getParameter("password");
		System.out.println("username" + name);
		System.out.println("password" + pass);
		if (name.equals("thinh") && pass.equals("12345"))
		{
			RequestDispatcher Req = request.getServletContext().getRequestDispatcher("/bootstrap/bootstrap.html");
			Req.forward(request, response);
		}
		else {
			response.sendRedirect("login.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
