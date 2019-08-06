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
 * Servlet Filter implementation class PermissionFilter
 */
@WebFilter({"/addUser", "/editUser", "/deleteUser"})
public class PermissionFilter implements Filter {

    /**
     * Default constructor. 
     */
    public PermissionFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	 HttpServletRequest httpReq = (HttpServletRequest) request;
	 HttpSession session = httpReq.getSession(false);
	 System.out.println("ff" + session.getAttribute("role"));
	 if (session != null && session.getAttribute("role") != null 
			             && (Integer)session.getAttribute("role")==1){
	
	 
		chain.doFilter(request, response);
	
	 }else {
		 RequestDispatcher rd = httpReq.getServletContext().getRequestDispatcher("/accessFenied.jsp");
		 rd.forward(request, response);
	 }

	}
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
