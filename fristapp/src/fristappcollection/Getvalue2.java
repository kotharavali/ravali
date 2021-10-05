package fristappcollection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Getvalue2")
public class Getvalue2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getvalue2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
String fristname=request.getParameter("xyz");
		
		System.out.println("firstname--"+fristname);
		response.setContentType("text/html");
        response.getWriter().write(fristname);;
		//out.println("<html><head><script> document.getElementBYId("placehereservletvalue").innerhtml=fristname</script></head></html>");
		 
		
		//response.setContentType("text/html");  
		//PrintWriter out = response.getWriter();  
		//out.println("<html><body><h1> hello ," +fristname+ "</h1></body></html>");
		
	}

}
