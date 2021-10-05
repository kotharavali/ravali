package fristappcollection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fristappimpl.imp;
import fristappservice.cckinf;

/**
 * Servlet implementation class CookiesServlet
 */
@WebServlet("/CookiesServlet")
public class CookiesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookiesServlet() {
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
		doGet(request, response); response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
        try {
	    String n=request.getParameter("first");  
	    String n1=request.getParameter("last"); 
	    out.print("Welcome "+n+"hello"+n1);  
	  
	    Cookie ck=new Cookie("uname",n);
	    Cookie ck1=new Cookie("uuname",n1);
	   response.addCookie(ck);
	   response.addCookie(ck1);
	   out.print("<form action='Cookservlet2s'>");  
	    out.print("<input type='submit' value='go'>");  
	    out.print("</form>");  
	   out.close(); 
        }
        catch(Exception e) {
        	e.printStackTrace();
        	
        }
	    //cckinf obj=new imp();
		//obj.String(request);
	}

}
