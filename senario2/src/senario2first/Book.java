package senario2first;

public class Book {
String AuthorName;
String BookName;
int BookNumber;
int BookCount;
public Book(){
	System.out.println("default");
	
}
 public Book(String AuthorName , String BookName,int BookNumber ,int BookCount){

	System.out.println("AuthorName="+AuthorName);
	System.out.println("BookName="+BookName);
	System.out.println("BookNumber="+BookNumber);
	System.out.println("BookCount="+BookCount);
	
}
 public Book( int BookCount ,int BookNumber , String AuthorName,String BookName ){
	System.out.println("AuthorName="+AuthorName);
	System.out.println("BookName="+BookName);
	System.out.println("BookNumber="+BookNumber);
	System.out.println("BookCount="+BookCount);
	
}

}
