package fristappimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.eclipse.jdt.internal.compiler.batch.Main;

import firstapp.dbutil.DbUtil;
import fristappbean.Emp;
import fristappservice.Register;

public class RegisterMethod implements Register {
Connection con;
int status=0;
	@Override
	public void method(String id, String name, String age) {
		// TODO Auto-generated method stub
		System.out.println("fristname---"+id+"secondname---"+name+"email---"+age);
		
		
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
	public int save(Emp e) {
		// TODO Auto-generated method stub
		DbUtil dbutil=new DbUtil();
		try {
			con= dbutil.getConnection();
		PreparedStatement ps=con.prepareStatement(  
                "insert into user905(id,name,age) values (?,?,?)");  
   ps.setString(1,e.getId());  
   ps.setString(2,e.getName());  
   ps.setString(3,e.getAge());  
     
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

	@Override
	public int update(Emp e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}
		
			/*public static void main(String[] args) {
				Register obj=new RegisterMethod();
				obj.method("aa", "ss", "dd");
				
			}*/
	}

	

