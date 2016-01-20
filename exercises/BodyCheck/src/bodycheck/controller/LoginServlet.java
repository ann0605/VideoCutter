package bodycheck.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.istack.internal.logging.Logger;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
		response.getWriter().append("Served at: ").append(request.getContextPath());


	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Logger.getLogger(this.getClass()).info("doPost.START");
		//String message;
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEE");
		String today = sdf.format(currentDate);
		request.getSession().setAttribute("TODAY", today);
		//request.getRequestDispatcher("login.jsp").forward(request, response);
		
		/*String email = request.getParameter("Email");
		String pass = request.getParameter("Password");
		Logger.getLogger(this.getClass()).info("doPost.START");
		request.getRequestDispatcher("home.jsp").forward(request, response);
		*/
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
}
