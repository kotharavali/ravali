package overloadding;

import java.util.Scanner;

public class OverloaddingConcept {
	int id;
	String adhar;
	String pan;
	double ack;
	void lodding(int id) {
		
		
		System.out.println("approve");
	}
	void lodding(String adhar , String pan) {
		System.out.println("approve");
	}
	void lodding(double ack) {
		System.out.println("approve");
	
	}
	public static void main(String[] args) {
		System.out.println("print the value of id");
		Scanner sc=new Scanner(System.in);
		//System.out.println("print the value of id");
		int y=sc.nextInt();

		OverloaddingConcept a= new OverloaddingConcept();
		a.lodding(y);
		 System.out.println("hello");
		 
		
		
	}

}
