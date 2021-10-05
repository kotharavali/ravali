package wrapper;

public class WrapperMethods {
	
	public static void main(String[] args) {
		
	
	int a=100;
	Integer b =Integer.valueOf(a);
	System.out.println("print"+b);
	String c=String.valueOf(a);
	System.out.println(c);
	String t="99";
	int x=b.intValue();
	int l=Integer.valueOf(b);
	System.out.println("print the int value"+x);
	String y=c.toString();
	
	System.out.println("print the valu of stringprmt"+y);
	//char d=b.charvalue();
	int j=Integer.valueOf(c);
	System.out.println("print c"+j);
	float q=6.6f;
	double w=Double.valueOf(q);
	System.out.println("print value of w"+w);
	String cc=Float.toString(q);
	
	Double g=Double.valueOf(w);
	System.out.println("print double"+g);
	double h=Double.valueOf(g);
	String o=String.valueOf(g);
	char ff='e';
	String gg=Character.toString(ff);
	
	
	}

	
}
