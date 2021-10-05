package fristappservice;

import fristappbean.Emp;

public interface Register {
	
	public void method(String id,String name,String age);
	 public  int save(Emp e);
	 public  int update(Emp e);
	 public int delete(int id);
}
	


