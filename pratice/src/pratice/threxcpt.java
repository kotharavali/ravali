package pratice;

public class threxcpt {
	int age=20;
	 public void m1(){
		 if(age>18) {
			 
		 
		 try {
			 throw new InvalidAgeException("age is invalid");
			 
		 }catch (Exception e) {
			// TODO: handle exception
			 System.out.println(e.getMessage());
		}
		 }
		 else  {
			 System.out.println("age is correct");
		 }
	 }
	 public static void main(String[] args) {
		 threxcpt obj=new threxcpt();
		 obj.m1();
		
	}

}
