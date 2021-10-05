package array.tet.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayConcept {
	
	

	public static void main(String[] args) {
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("a");
		obj.add("b");
		obj.add("c");
		obj.add("d");
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("ravali");
		a.add(90.0);
		Iterator<String> ob= obj.iterator();
		Iterator obx= a.iterator();
		System.out.println("the value of the arraylist are:");
		while(ob.hasNext()) {
			System.out.print(ob.next() + " ");
		}
		while(obx.hasNext()) {
			System.out.print(obx.next() + " ");
		}
			
		}
		
	}


