package pratice;

public class m2 {
	static int a=0;
	void m2() {
		a++;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		m2 obj=new m2();
		obj.m2();
		m2 obj1=new m2();
		obj1.m2();
		
		
	}

}
