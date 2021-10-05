package pratice;

public class FinalKeyword {
	final String name="ravali";
	void Keyword() {
		FinalKeyword obj=new FinalKeyword();
		String Names=obj.name;
		System.out.println("print the name "+Names);
		
	}
	public static void main(String[] args) {
		FinalKeyword obj1=new FinalKeyword();
		obj1.Keyword();
	}
	

}
