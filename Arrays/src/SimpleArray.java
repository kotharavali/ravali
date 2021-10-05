import java.util.Scanner;

public class SimpleArray {
	
	public static void main(String[] args) {
		int b[]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			System.out.println("enter value for a");
			int a=sc.nextInt();
		
			b[i]=a;
		
		}
		System.out.println(b[0]);
		Detail(b);
	}
		public static void Detail(int[] b) {
		for(int i=0;i<3;i++) {
			int s=b[i];
			
		System.out.println("print the value"+s);
		}
	}
}

