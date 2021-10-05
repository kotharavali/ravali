package fristappcollection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fristappimpl.Validation;
import fristappservice.singup;

/**
 * Servlet implementation class singup
 */
@WebServlet("/singupsevlet")
public class singupsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public singupsevlet() {
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
		String first=(String) request.getParameter("firstname");
		String second=(String) request.getParameter("lastname");
		String pwd=(String) request.getParameter("email");
		System.out.println("firstservlet-- "+first+" secondservlet----"+second+" password"+pwd);
		
		if(first.equals("ravali")&&second.equals("kotha")&&pwd.equals("pumkin")) { 
		singup obj=new Validation();
		obj.service(first, second, pwd);
	}
		else {
			System.out.println("in valid credentials");
		}

}
}
