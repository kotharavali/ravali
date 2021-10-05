
public class Constructer {
	int x;
	int y;
	public Constructer(int x,int y) {
		System.out.println("print the value of x"+x);
		System.out.println("print the value of y"+y);
	}
		
		public void M1(int d,int c){
			
			System.out.println("print the valurx"+d);
			System.out.println("print the value y"+c);
			
		
			
		}
		public Constructer() {
			
		}
		
		
	
	public static void main(String[] args) {
		Constructer obj=new Constructer(10,20);
		
		Constructer a=new Constructer();
	     a.M1(39, 10);
	
	}
	

}
