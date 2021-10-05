package abstractio;

public class Sbi extends Rbi {
	int rate=10;
	

	
	void Deposit() {
		// TODO Auto-generated method stub
		SimpleIntrest();
		double b= a*deposit*rate;
		System.out.println("print the value of b"+b);
		
		
		
		
	}

	
	void SimpleIntrest() {
		a=deposit*age;
		System.out.println("print the value of a"+a);
		// TODO Auto-generated method stub
	
		}
	public static void main(String[] args) {
	Rbi e=new Sbi();
		e.Deposit();
		
	}
	

}
