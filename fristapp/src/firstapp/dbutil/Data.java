package firstapp.dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class Data {
	Connection con;
	ResultSet set;
	Statement statement;
	boolean	b1;
	public void cat()  {
		DbUtil db = new DbUtil();
		con = db.getConnection();
		
		
		try {
			System.out.println("hello");
			PreparedStatement ps=con.prepareStatement("update ravali set cost=cost+1000 where cost=?");
						
           ps.setInt(1, 33);
           ps.executeUpdate();
           String rs=((ResultSet) ps).getString(1);
           System.out.println(rs);
							
		
		 
		}
		catch(Exception e){
			
		}
	}
	public static void main(String[] args) {
		Data obj=new Data();
		obj.cat();
		
	}
}
	



