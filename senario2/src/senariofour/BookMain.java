package senariofour;
import senariothree.BookImpl;
import senariothree.Bookinf;
import senario2first.Book;
import senarioscnd.bookInf;
import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
	bookInf d=new BookImpl();
		Scanner sc =new Scanner(System.in);
		System.out.println("enter author name");
		String name=sc.next();
	for(int i=0;i<1;i++) {
		if(name.equals("Chatanbhagat")) {
			d.authorone();
		}
			
		else if(name.equals("robart")) {
			
		d.authortwo();
		}
			
		}
	}

}


