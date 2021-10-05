package example;

public class Class1 {
	private String authorname;
	private int bookid;
	private String bookname;
	
	Class1(){
		
	}
	Class1(String authorname,int bookid,String bookname){
		this.authorname=authorname;
		this.bookid=bookid;
		this.bookname=bookname;
		
	}
	/**
	 * @return the authorname
	 */
	public String getAuthorname() {
		return authorname;
	}
	/**
	 * @param authorname the authorname to set
	 */
	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}
	/**
	 * @return the bookid
	 */
	public int getBookid() {
		return bookid;
	}
	/**
	 * @param bookid the bookid to set
	 */
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	/**
	 * @return the bookname
	 */
	public String getBookname() {
		return bookname;
	}
	/**
	 * @param bookname the bookname to set
	 */
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Class1 [authorname=" + authorname + ", bookid=" + bookid + ", bookname=" + bookname + "]";
	}

}
