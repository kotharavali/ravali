package fristappcollection;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fristappbean.author;
import fristappbean.emp2;
import fristappimpl.authorimpl;
import fristappimpl.xyz;
import fristappservice.Aurhor;
import fristappservice.Authorinf;

/**
 * Servlet implementation class authorsrvlet
 */
@WebServlet("/authorsrvlet")
public class authorsrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authorsrvlet() {
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
		
		String name=request.getParameter("name");
		String book=request.getParameter("pub");
		String  year=request.getParameter("year");
		Integer paasing= Integer.valueOf(year);
		String price=request.getParameter("cost");
		Integer valu=Integer.valueOf(price);
		
	System.out.println("author name:"+name+"book:"+book+"year:"+paasing+"price:"+valu);
	author emp=new author();
	emp.setName(name);
	emp.setPublisher(book);
	emp.setYear(paasing);
	emp.setCost(valu);
    Authorinf obj=new  authorimpl();
   int aa=obj.imp(emp);
   
    
if(aa>0) {
	
	System.out.println("record is save successfully---");
	request.getRequestDispatcher("authorpage.html").include(request,response);

	}else {
		System.out.println("valu does not exits");
	}
//obj.update(emp);
//obj.delete(emp);
obj.ascd(emp);
	}
}
