package senariofour;

import java.util.Scanner;

import senariotwo.BookImp;
import seniorthree.BookInf;

public class BookMain {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter author name");
		 String name=sc.next();
		 BookImp obj3=new BookInf();
		 switch(name) {
		 case "ChatanBhagat" :obj3.AuthorOne();
		 break;
		 case "RobertTolstoy":obj3.Authortwo();
		 break;
		 default:System.out.println("invalisd author");
		 
		 }
		 
		
	}
}



