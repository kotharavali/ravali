package bean;

public class BeanUser {
	private String username;
	private int empsa;
	private String empname;
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return 
	 * @return the empsal
	 */
	public int getEmpsa() {
		return empsa;
	}
	/**
	 * @param empsal the empsal to set
	 * @param empsa 
	 */
	public void setEmpsa( int empsa) {
		this.empsa = empsa;
	}
	/**
	 * @return 
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
	/* (non-Javado
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BeanUser [username=" + username + ", empsal=" + empsa + ", empname=" + empname + "]";
	}
	

}
