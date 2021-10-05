
public class ThisConstructer {
	int a;
	int b;
	int c;
	 public ThisConstructer() {
		 this(10,20);
		 System.out.println("print the name ravali");
		 
	 }
	 public ThisConstructer(int a,int b) {
		 c=a+b;
		 System.out.println("print the value of c "+c);
		 
		}
	 
	 public static void main(String[] args) {
		 ThisConstructer obj=new ThisConstructer();
	}

}
