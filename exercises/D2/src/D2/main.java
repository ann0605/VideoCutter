package D2;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class main
 */
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		String currentTime = sdf.format(cal.getTime());
		Date creationTime = new Date(session.getCreationTime());
		Date lastAccessed = new Date(session.getLastAccessedTime());
		String creation = sdf.format(creationTime);
		String last = sdf.format(lastAccessed);
		session.setAttribute("NOW", currentTime);
		session.setAttribute("CREATION", creation);
		session.setAttribute("LAST", last);
		request.getRequestDispatcher("index.jsp").forward(request, response);
		doGet(request, response);
	}

}
