package fristappimpl;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import firstapp.dbutil.DbUtil;
import fristappbean.author;
import fristappservice.Authorinf;

public class authorimpl implements Authorinf {
	Connection con;
	int status = 0;

	@Override
	public void concept(String name, String publisher, String cost, String year) {
		// TODO Auto-generated method stub

		DbUtil db = new DbUtil();
		try {
			con = db.getConnection();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public int imp(author e) {
		// TODO Auto-generated method stub
		DbUtil db = new DbUtil();
		con = db.getConnection();
		try {
			PreparedStatement ps = con
					.prepareStatement("insert into ravali(name,publisher,cost,year) values (? ,? ,? ,?)");
			ps.setString(1, e.getName());
			ps.setString(2, e.getPublisher());
			ps.setLong(3, e.getYear());
			ps.setLong(4, e.getCost());

			status = ps.executeUpdate();
			//con.close();
		} catch (Exception ee) {
			// TODO: handle exception
			ee.printStackTrace();

		} finally {
			if (con != null) {
				try {
					con.close();
				}catch(Exception e2){
					e2.printStackTrace();
				}
					
				}
						
							
			}
		
		return status;
	}

	
	public int update(author e){
		DbUtil db = new DbUtil();
		con = db.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("update ravali set name='ravali' where name=?");
			ps.setString(1,e.getName());
			status = ps.executeUpdate();
		
		
	}catch(Exception ee) {
		ee.printStackTrace();
	}finally {
		if (con != null) {
			try {
				con.close();
		
	}catch(Exception e3) {
		e3.printStackTrace();
	}
		
		
	}

}
		return status;
		
	}
	public int delete(author e) {
		DbUtil db = new DbUtil();
		con = db.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("delete from ravali where name=?");
			ps.setString(1,e.getName());
			status = ps.executeUpdate();
		
		
	}catch(Exception ee) {
		ee.printStackTrace();
	}finally {
		if (con != null) {
			try {
				con.close();
		
	}catch(Exception e3) {
		e3.printStackTrace();
	}
		}
		
		return status;
		
	}
	
	}
	public void ascd(author e) {
		 final String QUERY = "select name, publisher, cost , year from ravali";
		DbUtil db = new DbUtil();
		con = db.getConnection();
		try {
			System.out.println("hey");
			Statement stmt =   con.createStatement(); 	      
		         System.out.println("Fetching records in ascending order...");
		         ResultSet rs = stmt.executeQuery( QUERY+ " ORDER BY name ASC");
		         while(rs.next()){
		            //Display values
		            System.out.print("name: " + rs.getString("name"));
		            System.out.print(", publisher: " + rs.getString("publisher"));
		            System.out.print(", cost: " + rs.getInt("cost"));
		            System.out.println(", year: " + rs.getInt("year"));
		         }
		         rs.close();
		}
		         catch(Exception e4){
		        	 e4.printStackTrace();
		         }
			
		
	
}
}


