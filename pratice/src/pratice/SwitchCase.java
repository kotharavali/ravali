package pratice;

import java.util.Scanner;

public class SwitchCase {
	
		 
		
		int empid;
		String empname;
		int studid;
		String studname;
		public void employe( int empid,String empname) {
			this.empid=empid;
			this.empname=empname;
			System.out.println("empid----"+empid  + "empname----"+empname);
			
		}
		public void studentDetails(int studid, String studname) {
			this.studid=studid;
			this.studname=studname;
			System.out.println("studid-----"+studid + "studname-------"+studname);
			
		}
		public static void main(String[] args) {
			SwitchCase obj=new SwitchCase();
			Scanner sc=new Scanner(System.in);
			System.out.println("enetr the value");
			int x=sc.nextInt();
			System.out.println("enter the value");
			String y=sc.next();
			System.out.println("enter the value of c");
			int c=sc.nextInt();
		switch (c) {
		case 1:
			obj.employe(x,y);
			
			break;
		case 2:
		obj.studentDetails(x,y);
		break;

		default:
			System.out.println("print defalut value");
			break;
		}
	}
		

}
