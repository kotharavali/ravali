package senarioimpl;

import java.util.Scanner;

import senario3.First;
//import senarioinf.Second;

public class Three  {
	First first;

	
	public void  productDetailsService() {
		// TODO Auto-generated method stub
		First ob[]=new First[3];
		for(int i=0;i<3;i++) {
			
			
			Scanner sc=new Scanner(System.in);
			System.out.println("enter bookid");
			int Bookid1=sc.nextInt();
			System.out.println("enter bookname");
			String bookname1=sc.next();
			System.out.println("enter bookcount");
			double bookcount1=sc.nextDouble();
				ob[i]=new First(Bookid1,bookname1,bookcount1);
		}	
		
	productDetail(ob);
	}
	


	public void productDetail(First[] ob) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
		 first=ob[i];
		
		System.out.println("print value"+first);
		}
		
	}
	public static void main(String[] args) {
		
		Three obj=new Three();
		obj.productDetailsService() ;
	}
}

	
