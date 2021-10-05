package senariothree;
import senariothree.Bookinf;
import senario2first.Book;
import senarioscnd.bookInf;

public class BookImpl implements bookInf{

	@Override
	public void authorone() {
		
		// TODO Auto-generated method stub
		Book a=new Book("ChatanBhagat" ,"twoState",123,2);
		
	}

	@Override
	public void authortwo() {
		// TODO Auto-generated method stub
		Book a=new Book(234,3,"robart" ,"war");
		
	}

}
