package fristappcollection;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import firstapp.dbutil.DbUtil;
import fristappbean.Emp;
import fristappimpl.RegisterMethod;
import fristappservice.Register;

/**
 * Servlet implementation class RedisterAPPlicatin
 */
@WebServlet("/RedisterAPPlicatin")
public class RedisterAPPlicatin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedisterAPPlicatin() {
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
		String id=request.getParameter("name");
		String name=request.getParameter("name");
		String age=request.getParameter("email");
		System.out.println("fristttname---"+id+"secondddname---"+name+"email---"+age);
		Emp emp=new Emp();
		emp.setId(id);
		emp.setName(name);
		emp.setAge(age);
		Register obj=new RegisterMethod();
		
		obj.save(emp);
		
		
		
		
		
		
	}

}
