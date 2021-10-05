package abstractio;

public  class Second extends First {
	int d=2;
	int f;
	int h;
	@Override
	void m2() {
		// TODO Auto-generated method stub
		m1();
		f=c*d;
		System.out.println("print the value of f"+f);
		
		
	}
	@Override
	void m3() {
		// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		//First u=new Second();
		//u.m2();
		First z=new Second();
		z.m2();
		
		//First z=new third();
		//z.m2();
	}
	
	
	

}
