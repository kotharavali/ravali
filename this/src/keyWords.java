import java.util.Scanner;

public class keyWords {
	String name;
	double salary;
	
	public void rr(){
	
		System.out.println("enter the value of name "+name);
		System.out.println("enter the value of salary "+salary);
	}
	public void add(String name,double salary) {
	
		System.out.println("enter the value of name " +name);
		System.out.println("enter the value of salary " +salary);
		this.name=name;
		this.salary=salary;
		rr();
		
		
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the valu of ");
	String a=sc.nextLine();
	System.out.println("enter the value of b");
	double b=sc.nextDouble();
	keyWords obj=new keyWords();
	obj.add(a,b);
	

	
	
	
	
}
}
