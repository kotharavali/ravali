package com.java.studentimp;

import com.java.bean.StudentBean;
import com.java.constrants.Myconstrants;
import com.java.studenti.Students;

public class Studentimpts implements Students{

	@Override
	public StudentBean studentDetails() {
		// TODO Auto-generated method stub
		StudentBean bean=new StudentBean();
		bean.setId(Myconstrants.id);
		bean.setName(Myconstrants.name);
		
		return bean;
	}
	public static void main(String[] args) {
		Students obj=new Studentimpts();
		StudentBean rr=obj.studentDetails();
		
		System.out.println("print the valu"+rr.toString());
	}

	
	
	}

	
