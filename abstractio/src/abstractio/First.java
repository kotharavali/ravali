package abstractio;

public abstract class First {
	int a=10;
	int b=20;
	int c;
	void m1() {
		c=a+b;
		System.out.println("print the value"+c);
	}
	abstract void m2();
	abstract void m3();

}
