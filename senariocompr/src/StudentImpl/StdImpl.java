package StudentImpl;

import java.util.ArrayList;
import java.util.Collections;

import bean.Sudent;
import infc.StudentDetails;

public class StdImpl implements StudentDetails {

	
	@Override
	public ArrayList<Sudent> getStudentDetails() {
		// TODO Auto-generated method stub
		Sudent obj=new Sudent();
		obj.setStdid(1);
		obj.setStdname("ravali");
		obj.setStdscore(900);
		Sudent obj1=new Sudent();
		obj1.setStdid(2);
		obj1.setStdname("ravi");
		obj1.setStdscore(800);
		Sudent obj2=new Sudent();
		obj2.setStdid(3);
		obj2.setStdname("chumki");
		obj2.setStdscore(850);
		ArrayList list=new ArrayList();
		list.add(obj2);
		list.add(obj);
		list.add(obj1);
		System.out.println("before sorting"+list);
		Collections.sort(list);
		System.out.println("after sorting"+list);
		return list;
		
	}
	public static void main(String[] args) {
		StudentDetails ob=new StdImpl();
		ob.getStudentDetails();
		
	}

}
