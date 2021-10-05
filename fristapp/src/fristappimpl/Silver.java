package fristappimpl;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import firstapp.dbutil.DbUtil;
import fristappbean.MyModel;
import fristappbean.emp2;
import fristappservice.Tableinf;

public class Silver implements Tableinf {
Connection con;
	

	@Override
	public ArrayList<MyModel> gold(MyModel e) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				try {
				DbUtil db = new DbUtil();
				con = db.getConnection();
				Statement stm;
				stm = con.createStatement();
				String sql ="select * from ravali";
				ResultSet rst;
				rst = stm.executeQuery(sql);
				ArrayList<MyModel> arrList = new ArrayList<MyModel>();
		
				while (rst.next()) {
					
				MyModel mm = new MyModel();
				mm.setName(rst.getString(1));
				mm.setPublisher(rst.getString(2));
				mm.setCost(rst.getInt(3));
				mm.setYear(rst.getInt(4));
				arrList.add(mm);
				}
				
				
				Collections.sort(arrList, new NameComparator());
				for(MyModel ns:arrList) {
					System.out.println(ns.getName()+""+ns.getPublisher()+""+ns.getCost()+""+ns.getYear());
				
				}
				}
				catch(Exception ee){
			ee.printStackTrace();
				}
				return null;
				 

	}


	
		
	}


