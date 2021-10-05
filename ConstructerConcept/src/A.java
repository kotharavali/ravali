
public class A {
	public A() {
		this(10,20);
		System.out.println("print the default constructer");
	
	
	}
	public A(int x) {
		
		System.out.println("print the one parameters");
	}
	public A(int x,int y) {
		this(10);
		System.out.println("print the two parameters");
	}
	public static void main(String[] args) {
		A obj=new A();
	}
	

}
