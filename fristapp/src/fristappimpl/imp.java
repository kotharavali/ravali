package fristappimpl;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import fristappservice.cckinf;

public class imp implements cckinf{

	@Override
	public void String(HttpServletRequest request) {
		// TODO Auto-generated method stub
		
		 Cookie ck[]=request.getCookies();  
		    System.out.print("Hello "+ck[0].getValue());  
	}

}
