package fristappimpl;

import java.util.Comparator;

import fristappbean.MyModel;

public class NameComparator implements Comparator<MyModel>{

	@Override
	public int compare(MyModel o1, MyModel o2) {
		// TODO Auto-generated method stub
		return -o1.name.compareTo(o2.name);
	}


}
