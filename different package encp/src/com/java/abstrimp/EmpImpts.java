package com.java.abstrimp;

import java.util.Scanner;

import com.java.empabstr.Details;
import com.java.empl.Employee;

public class EmpImpts implements Details {
	

	@Override
	public Employee student(int id,String name) {
		// TODO Auto-generated method stub
		Employee obj=new Employee();
		obj.setId(id);
		obj.setName(name);
		System.out.println("print the value"+obj.toString());
		return null;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter value for id");
		int id=sc.nextInt();
		System.out.println("enter value for name");
		String name=sc.next();
		Details obj1=new EmpImpts();
		obj1.student(id,name);
	}

}