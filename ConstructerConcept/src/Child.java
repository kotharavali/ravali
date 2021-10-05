
public class Child extends Parent{
	public Child() {
		
	}
public Child(int a) {
	super(20);
	System.out.println("print the value of a"+a);
		
	}
void add() {
	String rr=super.name;
	System.out.println(rr);
	
}
public static void main(String[] args) {
	
 Child obj=new Child(50);
 obj.add();
}

}
