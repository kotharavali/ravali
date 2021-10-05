package impl;

import java.util.ArrayList;
import java.util.Scanner;

import infc.Employ;
import senariodubli.Bean;

public class EmployImpl implements Employ {
	static int empid;
	@Override
	public ArrayList<Bean> getEmployDetails(){
		
		Bean obj=new Bean();
		obj.setEmpid(1);
		obj.setEmpname("ravali");
		obj.setSal(1000);
		Bean obj1=new Bean();
		obj1.setEmpid(2);
		obj1.setEmpname("ravi");
		obj1.setSal(2000);
		ArrayList<Bean> list=new ArrayList<Bean>();
		list.add(obj);
		list.add(obj1);
		try {
		for(int i=0;i<3;i++) {
		if(list.get(0).getEmpid()!=empid) {
			
			Bean obj2=new Bean();
			obj2.setEmpid(3);
			obj2.setEmpname("honey");
			obj2.setSal(3000);
			System.out.println(" id "+obj2.getEmpid()+" name "+obj2.getEmpname()+" sal "+obj2.getSal());
			list.add(obj2);
		}
		
		else {
			throw new Exception ();
			}
		}
		}
	catch (Exception e) {
				// TODO: handle exception
		System.out.println("duplication of the value");
			}
		
		System.out.println("arryalist"+list);
			
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		empid=sc.nextInt();
		Employ x=new EmployImpl();
		x.getEmployDetails();
		
	}
}

		
	


