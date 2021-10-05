package Dataimpl;
import java.util.Scanner;
//import Datainfc.productService;

import Dataentry.Entry;
import Datainfc.productService;

//import Datainfc.productService;
 public class ProductImpl implements productService {
	
	 Entry entry;	

	public static void main(String[] args) {
		Entry a[]=new Entry[3];
		for(int i=0;i<3;i++) {
			Scanner sc=new Scanner(System.in);
			System.out.println("entery id");
			int id=sc.nextInt();
			System.out.println("entery code");
			int code=sc.nextInt();
			System.out.println("entry name");
			String name=sc.next();
			a[i]=new Entry(id,code,name);
		}
		System.out.println("print valu"+a[1]);
		ProductImpl obj=new ProductImpl();
	
		obj.Impl(a);
	}

	public Entry Impl(Entry[] x) {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			entry=x[i];
			
		System.out.println("print valu"+entry);
		}
		return null;
	}

	@Override
	public Entry impl() {
		// TODO Auto-generated method stub
		return null;
	}
	}

	
	

/*	@Override
	public Entry Impl() {
		// TODO Auto-generated method stub
		return null;
	}
    	
		
	}*/


