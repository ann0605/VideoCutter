package D3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseFilteredServlet
 */
public class ResponseFilteredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseFilteredServlet() {
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
		doGet(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html; charset=UTF8");
		PrintWriter out = response.getWriter();
		out.println("<BR>Please enter your details");
		out.println("<BR>");
		out.println("<BR><FORM METHOD=POST");
		out.println("<TABLE>");
		out.println("<TR>");
		out.println("<TD>First Name</TD>");
		out.println("<TD>INPUT TYPE = TEXT NAME = firstName</TD>");
		out.println("</TR>");
		out.println("TR");
		out.println("<TD>Last Name</TD>");
		out.println("<TD>INPUT TYPE = TEXT NAME = lastName</TD>");
		out.println("/TR");
		out.println("TR");
		out.println("<TD>User Name</TD>");
		out.println("<TD>INPUT TYPE = TEXT NAME = userName</TD>");
		out.println("/TR");		
		out.println("TR");
		out.println("<TD>Password</TD>");
		out.println("<TD>INPUT TYPE = PASSWORD NAME = password</TD>");
		out.println("/TR");
		out.println("</TD>");
		out.println("TR");
		out.println("<TD ALIGN=RIGHT COLSPAN=2>");
		out.println("<TD INPUT TYPE= SUBMIT VALUE = Login></TD>");
		out.println("</TR>");
		out.println("</TABLE>");
		out.println("</FORM>");
		
		out.close();
	}
	

}
