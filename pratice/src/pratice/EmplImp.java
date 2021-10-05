package pratice;

public class EmplImp {
	 int v;
	 int c;
	public int add(TryingEncp d ) {
	
		 int c=d.getA()+d.getB();
		System.out.println("print value c"+c);
		v=c;
		return c;
	}
	public int sub(TryingEncp d) {
     
	  c=d.getA()-d.getB();
		System.out.println("print the valu cc"+c);
		return c;
	}
	public static void main(String[] args) {
		TryingEncp d=new TryingEncp();
		EmplImp f=new EmplImp();
		d.setA(10);
		d.setB(20);
	    f.add(d);
	    d.setC(f.v);
	    System.out.println(d.getC());
	    
	    f.sub(d);
	    d.setC(f.c);
       System.out.println(d.getC());
	}

}
