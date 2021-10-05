package pratice;

import java.util.ArrayList;

public class arraylst {
	public void abc() {
		ArrayList ob=new ArrayList();
		ob.add("ravali");
		ob.add("ravi");
		ob.add("honey");
		ob.add("chumki");
		ArrayList ox=new ArrayList();
		ox.add("rahul");
		ox.add("ravi");
		ox.add("cheery");
		ox.add("raju");
		System.out.println("vlau=----"+ob.get(3));
		System.out.println("value of-----"+ox.lastIndexOf("cheery"));
		System.out.println("value of ------"+ox.size());
		System.out.println("value of------"+ox.toString());
		System.out.println("value of-----");
	}
	public static void main(String[] args) {
		arraylst obj=new arraylst();
		obj.abc();
	
		

}
}
