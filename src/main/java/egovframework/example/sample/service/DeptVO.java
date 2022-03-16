package egovframework.example.sample.service;

public class DeptVO {
	
	private int deptNo;
	private String deptName;
	private String deptLoca;
	
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoca() {
		return deptLoca;
	}
	public void setDeptLoca(String deptLoca) {
		this.deptLoca = deptLoca;
	}
	
	@Override
	public String toString() {
		return "DeptVO [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLoca=" + deptLoca + "]";
	}
	
}
