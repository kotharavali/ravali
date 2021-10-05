package senario3;

public class First {
	int Bookid;
	String bookname;
	double bookcount;
	 
	public  First(int Bookid,String bookname,double bookcount) {
		this.Bookid=Bookid;
		this.bookname=bookname;
		this.bookcount=bookcount;
		
		/*System.out.println(Bookid);
		System.out.println(bookname);
		System.out.println(bookcount);*/
	}

	public int getBookid() {
		return Bookid;
	}

	public void setBookid(int bookid) {
		Bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public double getBookcount() {
		return bookcount;
	}

	public void setBookcount(double bookcount) {
		this.bookcount = bookcount;
	}

	@Override
	public String toString() {
		return "First [Bookid=" + Bookid + ", bookname=" + bookname + ", bookcount=" + bookcount + "]";
	}


}
