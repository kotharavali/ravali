package fristappcollection;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class sessionservletone
 */
@WebServlet("/sessionservletone")
public class sessionservletone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public sessionservletone() {
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
		String firstname=request.getParameter("firstname");
		String secondname=request.getParameter("secondname");
		System.out.println("firstname---- " +firstname+ " secondname----"+secondname);
		HttpSession session=request.getSession();
		session.setAttribute("fname", firstname); 
		session.setAttribute("sname", secondname); 
		RequestDispatcher rd=request.getRequestDispatcher("ServeltTwo");  
		//servlet2 is the url-pattern of the second servlet  
		  
		rd.forward(request, response);//method may be include or forward    
		  
		 
	}

}
