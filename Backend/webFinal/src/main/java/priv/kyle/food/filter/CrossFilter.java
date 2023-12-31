package priv.kyle.food.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter("/*")
public class CrossFilter extends HttpFilter implements Filter {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
//		System.out.println("过滤器");		

		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("application/json;charset=utf-8");
		response.addHeader("Access-Control-Allow-Origin",request.getHeader("Origin")); 
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.addHeader("Access-Control-Allow-Headers", 
				"Accept,"
				+ "Origin,"
				+ "No-Cache,"
				+ "X-Requested-With,"
				+ "If-Modified-Since,"
				+ "Pragma,"
				+ "Last-Modified,"
				+ "Cache-Control,"
				+ "Expires,"
				+ "Content-Type,"
				+ "X-E4M-With");
		chain.doFilter(req, res);

	}

	public CrossFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
}
