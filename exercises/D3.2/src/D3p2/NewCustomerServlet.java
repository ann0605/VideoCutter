package D3p2;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewCustomerServlet
 */
public class NewCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewCustomerServlet() {
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
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		String customerName = request.getParameter("name");
		String customerAccount = request.getParameter("account");
		String customerPassword = request.getParameter("password");
		
		System.out.println("name=" + customerName +"account = "
		+ customerAccount);
		//request.getRequestDispatcher("VIEW.jsp").forward(request, response);

		boolean isSuccess = processAddCustomer(customerAccount, customerName, customerPassword);
		if(isSuccess){
			request.getRequestDispatcher("VIEW.jsp").forward(request, response);

		}else{
			request.getRequestDispatcher("FAILED.jsp").forward(request, response);
		}
	}
	
	public void init(ServletConfig config){
		ServletContext sc = config.getServletContext();
		String jdbcDriver = sc.getInitParameter("jdbcDriver");
		String jdbcUrl = sc.getInitParameter("jdbcUrl");
		String jdbcUsername = sc.getInitParameter("jdbcUsername");
		String jdbcPassword = sc.getInitParameter("jdbcPassword");
	}
	
	public boolean processAddCustomer(String customerAccount, String customerName, String customerPassword){
		boolean isSuccess = true;
		String sql = "INSERT INTO MST_CUSTOMER(ACCOUNT, NAME, PASSWD) VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		Connection conn = null;
		ResultSet rs = null;
		
		System.out.println("processAddCustomer...");
		try{
			Class.forName(jdbcDriver);
			
			Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
			pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, customerAccount);
			pstmt.setString(2, customerName);
			pstmt.setString(3,  customerPassword);
			pstmt.executeUpdate();
			rs = pstmt.getGeneratedKeys();
			if(rs.next()){
				int nextKey = rs.getInt(1);
				System.out.println("nextKey=" + nextKey);
			}else{
				System.out.println("Could not get generateKey!");
			}
			
		}catch(SQLException ex){
			ex.printStackTrace();
			isSuccess = false;
		}catch(ClassNotFoundException ex){
			ex.printStackTrace();
			isSuccess = false;
		}
		finally{
			if(rs!=null){
				try{
					pstmt.close();
				}catch(SQLException ex){
					ex.printStackTrace();
				}
			}
			if(conn!=null){
				try{
					conn.close();
				}catch(SQLException ex){
					ex.printStackTrace();
				}
			}
			
		}
		return isSuccess;
	}

}
