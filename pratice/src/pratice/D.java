package pratice;

public class D extends B {
	public void m2() {
		super.m1();
	
		c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		D obj=new D();
		obj.m2();
	}

}
