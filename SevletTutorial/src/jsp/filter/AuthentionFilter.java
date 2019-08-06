package jsp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AuthentionFilter
 */
@WebFilter({"/admin", "/addUser", "/editUser", "/deleteUser"})
public class AuthentionFilter  implements Filter {

       



	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
		
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpSession session = httpReq.getSession(false);
		if (session != null && session.getAttribute("username")!= null) {
			chain.doFilter(request, response);
			
		}else {
			RequestDispatcher rd =httpReq.getServletContext().getRequestDispatcher("/login.jsp");
			rd.forward(request, response);		
		}

	}
	@Override
	public void init(FilterConfig filterconfig) throws ServletException{
		
	}
	public void destroy() {}
}
