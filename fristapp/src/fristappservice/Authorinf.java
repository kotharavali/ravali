package fristappservice;

import fristappbean.author;
import fristappbean.emp2;

public interface Authorinf {
	
	public void concept(String name,String publisher,String cost,String year);
	public int imp(author e);
	public int update(author e);
	public int delete(author e);
	public void ascd(author e);
}
