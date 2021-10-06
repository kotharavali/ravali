package impl;

import java.util.ArrayList;
import java.util.Scanner;

import bean.BeanUser;
import infc.UserInfc;

public class Employe implements UserInfc {
static String name;
	@Override
	public ArrayList<BeanUser> getUserDetails() {
		// TODO Auto-generated method stub
		BeanUser obj=new BeanUser();
		obj.setUsername("xyz");
		obj.setEmpsa(2000);
		obj.setEmpname("rr");
		//System.out.println(" id "+obj.getUsername()+" sal "+obj.getEmpsa()+" name "+obj.getEmpname());
		BeanUser obj1=new BeanUser();
		obj1.setUsername("abc");
		obj1.setEmpsa(3000);
		obj1.setEmpname("ss");
		BeanUser obj2=new BeanUser();
		obj2.setUsername("pqr");
		obj2.setEmpsa(4000);
		obj2.setEmpname("kk");
		ArrayList li=new ArrayList();
		li.add(obj);
		li.add(obj1);
		li.add(obj2);
		//System.out.println(li);
		try {
		if(((BeanUser) li.get(0)).getUsername().equals(name)) {
			System.out.println(" id "+obj.getUsername()+" sal "+obj.getEmpsa()+" nam "+obj.getEmpname());
			
		}
		else if(((BeanUser) li.get(1)).getUsername().equals(name)) {
			System.out.println(" id "+obj1.getUsername()+" sal "+obj1.getEmpsa()+" nam "+obj1.getEmpname());
		}
		else if(((BeanUser) li.get(2)).getUsername().equals(name) ){
			System.out.println(" id "+obj2.getUsername()+" sal "+obj2.getEmpsa()+" nam"+obj2.getEmpname());
		}
		else {
			throw new Exception();
			
		}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("username not found");
		}
		
		return li;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.next();
		
		UserInfc ob=new Employe ();
		ob.getUserDetails();
		System.out.println("hi");
	}

}
