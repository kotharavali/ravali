package seniorthree;

import senarios.Book;
import senariotwo.BookImp;

public class BookInf implements BookImp {
String x;
String y;
String name;
	
	public Book AuthorOne() {
		// TODO Auto-generated method stub
		
		Book obj=new Book();
	    obj.setAuthorname("ChetanBhagat");
		obj.setBookname("twostate");
		obj.setId(234);
		obj.setSelfcount(2);
		x=obj.getAuthorname();
		System.out.println(obj.toString());
		
		
		return null;
		}
		
	
    	public Book Authortwo() {
		
		// TODO Auto-generated method stub
	
		Book obj1=new Book();
		
		obj1.setAuthorname("RobertTolstoy");
		obj1.setBookname("Anna Karenina");
		obj1.setId(143);
		obj1.setSelfcount(1);
		System.out.println(obj1.toString());
		
	return null;
	}

}
		
	
		


