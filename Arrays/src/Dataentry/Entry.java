package Dataentry;

public class Entry {
	int productid;
	int productcode;
	String productname;
	 public Entry(int id,int code,String name){
		
		this.productid=id;
		this.productcode=code;
		this.productname=name;
		
	}
	 
	 public int getProductid() {
			return productid;
		}
		public void setProductid(int productid) {
			this.productid = productid;
		}
		public int getProductcode() {
			return productcode;
		}
		public void setProductcode(int productcode) {
			this.productcode = productcode;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		@Override
		public String toString() {
			return "Entry [productid=" + productid + ", productcode=" + productcode + ", productname=" + productname + "]";
		}
		 
		
}
