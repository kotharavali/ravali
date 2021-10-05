package pratice;

import java.util.Scanner;

public class SwitchAdv {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("pleas eneter value");
	int c=sc.nextInt();
	switch(c) {
	case 1:
	case 2:
	case 3:
		System.out.println("hi");
		break;
	case 4:
	case 5:
	case 6:
		System.out.println("hello");
		break;
	
	}
	}
	

}
