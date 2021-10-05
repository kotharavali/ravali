package senarios;

public class Book {
	String bookname;
	String authorname;
	int selfcount;
	int id;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	
	public String getAuthorname() {
		return authorname;
	}
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	
	public int getSelfcount() {
		return selfcount;
	}
	public void setSelfcount(int selfcount) {
		this.selfcount = selfcount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Book [bookname=" + bookname + ", authorname=" + authorname + ", selfcount=" + selfcount + ", id=" + id
				+ "]";
	}
	
	
	
	
	
}