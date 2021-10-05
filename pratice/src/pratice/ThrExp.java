package pratice;

public class ThrExp {

	String Fname,Lname;
	int sclass,marks,id;
	ThrExp a;
	public void ssd(ThrExp[] obj) {
		for(int i=0;i<=3;i++) {
			a=obj[i];
			System.out.println(a);
		}
		
		
	}
	
	
	public void stdDetail(String Fname ,String Lname,int sclass,int marks,int id) {
		this.Fname=Fname;
		this.Lname=Lname;
		this.sclass=sclass;
		this.marks=marks;
		this.id=id;
		
		System.out.println("Fname " +Fname+ "Lname " +Lname+ "sclass " +sclass+ "marks " +marks+ "id" +id);
	
		}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Fname=" + Fname + ", Lname=" + Lname + ", sclass=" + sclass + ", marks=" + marks + ", id=" + id
				+ "";
	}

	public static void main(String[] args) {
		ThrExp obj[]=new ThrExp[4];
		ThrExp obj1=new ThrExp();
		obj1.stdDetail("telukuntla","vivk",6,300,123);
		ThrExp obj2=new ThrExp();
		obj2.stdDetail("kesa","raghavendra",16,600,456);
		ThrExp obj3=new ThrExp();
		obj3.stdDetail("kesa","rahul",4,700,789);
		ThrExp obj4=new ThrExp();
		obj4.stdDetail("kotha","ravali",2,800,167);
		obj[0]=obj1;
		obj[1]=obj2;
		obj[2]=obj3;
		obj[3]=obj4;
		
		ThrExp ob=new ThrExp();
		ob.ssd(obj);
	}
}
