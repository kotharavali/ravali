package fristappbean;

public class emp2{
private	String name;
private	String book;
private	String year;
private	String price;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the bookname
 */
public String getBook() {
	return book;
}
/**
 * @param bookname the bookname to set
 * @param book 
 */
public void setBookname(String bookname, String book) {
	this.book = book;
}
/**
 * @return the year
 */
public String getYear() {
	return year;
}
/**
 * @param year the year to set
 */
public void setYear(String year) {
	this.year = year;
}
/**
 * @return the price
 */
public String getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(String price) {
	this.price = price;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */
@Override
public String toString() {
	return "BookBean [name=" + name + ", bookname=" + book + ", year=" + year + ", price=" + price + "]";
}
public void setBook(String book2) {
	// TODO Auto-generated method stub
	
}
 


}
