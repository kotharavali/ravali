package fristappcollection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fristappbean.MyModel;
import fristappbean.emp2;
import fristappimpl.Silver;

/**
 * Servlet implementation class rsrvlet
 */
@WebServlet("/rsrvlet")
public class rsrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rsrvlet() {
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
		String name=request.getParameter("name");
		String book=request.getParameter("pub");
		String  year=request.getParameter("year");
		Integer paasing= Integer.valueOf(year);
		String price=request.getParameter("cost");
		Integer valu=Integer.valueOf(price);
		
	System.out.println("author name:"+name+"book:"+book+"year:"+paasing+"price:"+valu);
	MyModel ms=new MyModel();
	ms.setName(name);
	ms.setPublisher(book);
	ms.setYear(year);
	ms.setCost(price);
	Silver ss=new Silver();
	ss.gold(ms);
	
		doGet(request, response);
		
	}

}
