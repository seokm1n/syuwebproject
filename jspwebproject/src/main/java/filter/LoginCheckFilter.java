package filter;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginCheckFilter {
	/*@Override
	public void init(FilterConfig config) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(false);
		
		boolean login = false;
		if (session != null) {
			if (session.getAttribute("MEMBER") != null) {
				login = true;
			}
		}
		if (login) {
			chain.doFilter(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/loginForm.jsp");
			dispatcher.forward(httpRequest, response);
		}
	}
	
	@Override
	public void destroy() {
	}*/
}
