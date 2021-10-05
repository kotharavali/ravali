package pratice;

public class ExampleScnd extends Example{
	String color="white";
	void sub() {
		String fvt=super.color;
		System.out.println(color);
		System.out.println(fvt);
	}
public static void main(String[] args) {
	 ExampleScnd obj=new  ExampleScnd ();
	 obj.sub();
}
}
