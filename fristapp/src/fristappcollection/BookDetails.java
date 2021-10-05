package fristappcollection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fristappbean.Emp;
import fristappbean.emp2;
import fristappimpl.xyz;
import fristappimpl.RegisterMethod;
import fristappservice.Aurhor;
import fristappservice.Register;

/**
 * Servlet implementation class BookDetails
 */
@WebServlet("/phone")
public class BookDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
    */
    public BookDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		/*
	}


  /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response */
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		String name=request.getParameter("author");
		String book=request.getParameter("book");
		String year=request.getParameter("year");
		String price=request.getParameter("price");
		
	System.out.println("author name:"+name+"book:"+book+"year:"+year+"price:"+price);
	emp2 emp=new emp2();
	emp.setName(name);
	emp.setBook(book);
	emp.setYear(year);
	emp.setPrice(price);
    Aurhor obj=new xyz();
    obj.save(emp);

	}
}


