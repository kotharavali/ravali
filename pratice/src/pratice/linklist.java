package pratice;

import java.util.LinkedList;
import java.util.Scanner;

public class linklist {
	public void list() {
		LinkedList obj=new LinkedList();
		obj.add(12);
		obj.add(13);
		obj.add(14);
		obj.add(15);
		obj.add(13);
		obj.add(6, 4);
		System.out.println(obj);
		
	}
	public static void main(String[] args) {
		linklist ob=new linklist();
		ob.list();
	}
	
}
