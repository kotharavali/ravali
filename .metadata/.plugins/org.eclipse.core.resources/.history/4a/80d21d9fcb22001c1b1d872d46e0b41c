package firstapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	Connection con=null ;
	 public Connection getConnection() {
		 try {

        Class.forName("com.mysql.cj.jdbc.Driver");
System.out.println("welcom");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/july","root","ravali21");
         System.out.println("connection-----"+con);
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	 }

	



