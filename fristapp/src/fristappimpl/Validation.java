package fristappimpl;

import java.util.ArrayList;

import fristappservice.singup;

public class Validation implements singup {

	@Override
	public void service(String firstname, String secondname, String password) {
		// TODO Auto-generated method stub
		System.out.println("firstnameimpl---- "+firstname+" secondnameimpl---- "+secondname+" passwordimol--"+password);
		ArrayList<String> ss=new ArrayList<String>();
		ss.add(firstname);
		ss.add(secondname);
		ss.add(password);
		System.out.println("arraylis---"+ss);
	}

}
