package pratice;

import java.util.Scanner;

public  class Imp extends AbstractEx  {
//int id;
//String name;
	void person(int id,String name) {
		super.id=id;
		super.name=name;
		
		// TODO Auto-generated method stub
		System.out.println("print value id"+id);
		System.out.println("print the value name"+name);
	}

	@Override
	void details() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the value of id");
				int id=sc.nextInt();
				System.out.println("enter the value of name");
				String name=sc.next();
				AbstractEx r=new Imp();
				r.person(id, name);
		
	}

	

}
