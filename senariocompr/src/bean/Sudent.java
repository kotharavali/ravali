package bean;

import java.util.Comparator;

public class Sudent implements Comparable<Sudent> {
	private int stdid;
	private String stdname;
	private int stdscore;
	/**
	 * @return the stdid
	 */
	
	public int getStdid() {
		return stdid;
	}
	/**
	 * @param stdid the stdid to set
	 */
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	/**
	 * @return the stdname
	 */
	public String getStdname() {
		return stdname;
	}
	/**
	 * @param stdname the stdname to set
	 */
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	/**
	 * @return the stdscore
	 */
	public int getStdscore() {
		return stdscore;
	}
	/**
	 * @param stdscore the stdscore to set
	 */
	public void setStdscore(int stdscore) {
		this.stdscore = stdscore;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Sudent [stdid=" + stdid + ", stdname=" + stdname + ", stdscore=" + stdscore + "]";
	}
	
	
	@Override
	public int compareTo(Sudent arg0) {
		// TODO Auto-generated method stub
		return this.stdid-arg0.stdid;
	}
	
	
	

}
