package fristappbean;

import java.util.Comparator;

public class MyModel {
	public String name;
	public String Publisher;
	public int cost;
	public int year;
	
	
	public MyModel(String name, String publisher, int cost, int year) {
		super();
		this.name = name;
		Publisher = publisher;
		this.cost = cost;
		this.year = year;
	}

	public MyModel() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost =cost ;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "MyModel [name=" + name + ", Publisher=" + Publisher + ", cost=" + cost + ", year=" + year + "]";
	}



	public void setCost(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setYear(String string) {
		// TODO Auto-generated method stub
		
	}


	
	

}
