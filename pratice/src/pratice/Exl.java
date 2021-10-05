package pratice;

public class Exl {
	private int empid;
	private String empname;
	private int sal;
	/**
	 * @return the empid
	 */
	public int getEmpid() {
		return empid;
	}
	/**
	 * @param empid the empid to set
	 */
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	/**
	 * @return the empname
	 */
	public String getEmpname() {
		return empname;
	}
	/**
	 * @param empname the empname to set
	 */
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	/**
	 * @return the sal
	 */
	public int getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(int sal) {
		this.sal = sal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Exl [empid=" + empid + ", empname=" + empname + ", sal=" + sal + "]";
	}
	
	
}
