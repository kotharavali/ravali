package fristappimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TreeSet;

import firstapp.dbutil.DbUtil;
import fristappbean.Emp;
import fristappbean.emp2;
import fristappservice.Aurhor;

public class xyz implements Aurhor{
	Connection con;
	int status=0;
	@Override
	public void details(String name, String book, String year, String price) {
		// TODO Auto-generated method stub
		//TreeSet al=new TreeSet();
		System.out.println("name:"+name+"bookname"+book+"year"+year+"price"+price);
		try {
			DbUtil dbutil=new DbUtil();
		con= dbutil.getConnection();
		
		System.out.println("connection success---"+con);
		
     
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		}

	@Override
	public int save(emp2 e) {
		// TODO Auto-generated method stub
		DbUtil dbutil=new DbUtil();
		try {
			con= dbutil.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into author(name,book,year,price) values (? ,? ,? ,?)");
   ps.setString(1,e.getName());  
   ps.setString(2,e.getBook());  
   ps.setString(3,e.getYear()); 
   ps.setString(4,e.getPrice()); 
     
   status=ps.executeUpdate();  
   
   con.close();  
	}catch (Exception ep) {
		// TODO: handle exception
		ep.printStackTrace();
	}finally {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
	}
		return status;
	}
}
	
