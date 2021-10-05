package bean;

public class EmployBean {
	private int empid;
	private String empname;
	private int empsal;
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
	 * @return the empsal
	 */
	public int getEmpsal() {
		return empsal;
	}
	/**
	 * @param empsal the empsal to set
	 */
	public void setEmpsal(int empsal) {
		this.empsal = empsal;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployBean [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	

}
