package pratice;

import java.util.Scanner;

public class SwitchData {
	static String datatype;
	static int day;
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
		System.out.println("enetr the value of x");
		int x=sc.nextInt();
		System.out.println("enetr the value of y");
		int y=sc.nextInt();
		
		switch(x) {
		case 1:
			 datatype="monday";
		case 2:
			 datatype="tuseday";
		case 3:
			datatype="wednesday";
			switch(y) {
			case 1:
				day=21;
				break;
			case 2:
				day=45;
				break;
				
			
		}
			System.out.println("print datatype "+datatype +"print the value od day "+day);
		
		}
	}

}
