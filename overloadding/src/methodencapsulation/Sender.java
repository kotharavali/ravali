package methodencapsulation;

public class Sender {
	
	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setA(10);
		obj.setName("ravali");
		obj.setId(200);
		//System.out.println("valu a"+obj.getA() + "value name" +obj.getName() + "value of id"+obj.getId());
		gets s=new gets();
		s.abc(obj);
		
	}
}

