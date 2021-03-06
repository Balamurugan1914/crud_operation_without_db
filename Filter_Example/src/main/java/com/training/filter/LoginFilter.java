package com.training.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.logging.*;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(urlPatterns = "/*",dispatcherTypes = DispatcherType.FORWARD)
public class LoginFilter implements Filter {
	Logger log = Logger.getLogger(this.getClass().getName());

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request; // request
		String reqURL = req.getRequestURL().toString();

		log.info("URI - " + reqURL);
 
		chain.doFilter(request, response);  // middle filter
		
		HttpServletResponse res = (HttpServletResponse) response;  //response

		String contenttype = res.getContentType();
		log.info(contenttype);
		
		res.getWriter().println("<h2> set By filter </h2>");
		
		res.setHeader("custom", "set by filter");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
