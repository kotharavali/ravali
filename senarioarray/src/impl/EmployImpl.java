package impl;

import java.util.ArrayList;
import java.util.Scanner;

import bean.EmployBean;
import infc.EmployInfc;

public class EmployImpl implements  EmployInfc {
	static int empid;
	//private Object Systam;

	@Override
	public ArrayList<EmployBean> getEmployDetails() {
		// TODO Auto-generated method stub
      EmployBean x=new EmployBean();
		x.setEmpid(1);
		x.setEmpname("ravali");
		x.setEmpsal(2000);
		//System.out.println("id "+x.getEmpid() +"name "+x.getEmpname()+"sal "+x.getEmpsal());
		EmployBean y=new EmployBean();
		y.setEmpid(2);
		y.setEmpname("rakesh");
		y.setEmpsal(3000);
		//System.out.println("id "+y.getEmpid() +"name "+y.getEmpname()+"sal "+y.getEmpsal());
		EmployBean z=new EmployBean();
		z.setEmpid(3);
		z.setEmpname("rajesh");
		z.setEmpsal(4000);
		//System.out.println("id "+z.getEmpid() +"name "+z.getEmpname()+"sal "+z.getEmpsal());
		ArrayList list=new ArrayList();
		list.add(x);
		list.add(y);
		list.add(z);
		//System.out.println(list.add(x));
		try {
			if(((EmployBean) list.get(0)).getEmpid()==empid) {
				System.out.println("id "+x.getEmpid() +"name "+x.getEmpname()+"sal "+x.getEmpsal());
			
			}
			else if(((EmployBean) list.get(1)).getEmpid()==empid) {
				System.out.println("id "+y.getEmpid() +"name "+y.getEmpname()+"sal "+y.getEmpsal());
			}
			else if(((EmployBean) list.get(2)).getEmpid()==empid) {
				System.out.println("id "+z.getEmpid() +"name "+z.getEmpname()+"sal "+z.getEmpsal());
			}
				else {
					throw new Exception();
				}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("id not found");
		}
		
		
		
		
		
		//System.out.println("arrayvalus"+list);
		return list;
	}


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter empid");
		 empid=sc.nextInt();
		
		
		EmployInfc obj=new EmployImpl();
		obj.getEmployDetails();
	


}
}

