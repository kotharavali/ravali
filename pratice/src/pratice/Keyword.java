package pratice;

import java.util.Scanner;

public class Keyword {
String name1;
String name2;
void add(String name1 , String name2) {
	String name3=name1+name2;
	System.out.println("print the name "+name3);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name1");
	String a=sc.nextLine();
	System.out.println("enter the name2");
	String b=sc.nextLine();
	Keyword obj=new Keyword();
	obj.add(a,b);
	
	
	
	
}
}
