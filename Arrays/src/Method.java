
public class Method {
	int id;
	String name;
	double sal;
	static Method s;
	public Method() {
		
	}
	public  Method( Method[] obj) {
		for(int i=0;i<3;i++) {
			Method s=obj[i];
			System.out.println(s);
			
		}	
		
	}
	
	public Method(int id, String name, double sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	System.out.println("id "+id + " name "+name+" sal "+sal);
	
	}


	@Override
	public String toString() {
		return "Method [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
		
	
	public static void main(String[] args) {
	Method obj[]=new Method[3];
	obj[0]=new Method(1,"a",10.0);
	obj[1]=new Method(2,"b",20.0);
    obj[2]=new Method(3,"c",30.0);
    new Method(obj);
    
	
	} 

}
