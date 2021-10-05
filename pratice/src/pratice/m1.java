package pratice;

public class m1 {
	int a=0;
	
	public void m1() {
    a++;
    System.out.println(a);
		}
	public static void main(String[] args) {
		m1 obj=new m1();
		obj.m1();
		m1 obj2=new m1();
		obj2.m1();
		
}

}

