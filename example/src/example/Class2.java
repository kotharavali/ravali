package example;

import java.util.Scanner;

public class Class2 {
	
	public void Class3(Class1[] obj) {
		for(int i=0;i<2;i++) {
			Class1 s=obj[i];
			System.out.println("print"+s);
			
			}
		

	}
	 public void Class() {
		 Class2 ob=new Class2();
		 Class1 obj[]=new Class1[2];
		 
		//Class1 j=new Class1();
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<2;i++) {
				System.out.println("enter the authorname");
				String authorname=sc.next();
				System.out.println("enter the bookid");
				int bookid=sc.nextInt();
				System.out.println("enter the bookname");
				String bookname=sc.next();
				obj[i]=new Class1(authorname,bookid,bookname);
				
			}
				ob.Class3(obj);
				
				
	 }
		

	
public static void main(String[] args) {
	Class2 obb=new Class2();
	obb.Class();
	Class1 j=new Class1();
	System.out.println(j.getBookid());

	
	}
	
	
	
	
	
}

