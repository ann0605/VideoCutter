package D3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ResponseFilter implements Filter{
	private FilterConfig filterConfig = null;
	
	public void destroy(){
		System.out.println("Filter destroyed");
		this.filterConfig = null;
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
		System.out.println("doFilter");
		PrintWriter out = response.getWriter();
		out.println("<HTML>");
		out.println("<BODY>");
		out.println("<CENTER>");
		out.println("<H1>Page Header</H1>");
		out.println("<BODY>");
		out.println("<HR>");
		chain.doFilter(request, response);
		out.println("</CENTER>");
		out.println("</BODY>");
		out.println("</HTML>"); 		
	}
	
	public void init(FilterConfig filterConfig) throws ServletException{
		System.out.println("Filter initialized");
		this.filterConfig = filterConfig;
	}
	
	
	

}
