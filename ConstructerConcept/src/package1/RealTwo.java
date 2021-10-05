package package1;

public class RealTwo extends Real {

	public RealTwo() {
		// TODO Auto-generated constructor stub
	}
	public RealTwo(int id,String name,float salary) {
		// TODO Auto-generated constructor stub
		super(id,name);
		System.out.println("print id "+id +"print name "+name +  "print salary " +salary);
	}
	public static void main(String[] args) {
		RealTwo g=new RealTwo(10,"raj",7893);
		
	}
}
