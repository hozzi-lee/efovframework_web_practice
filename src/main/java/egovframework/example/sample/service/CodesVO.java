package egovframework.example.sample.service;

public class CodesVO {
	private int codeNo;
	private int gidNo;
	private String codeName;
	
	public int getCodeNo() {
		return codeNo;
	}

	public void setCodeNo(int codeNo) {
		this.codeNo = codeNo;
	}

	public int getGidNo() {
		return gidNo;
	}

	public void setGidNo(int gidNo) {
		this.gidNo = gidNo;
	}

	public String getCodeName() {
		return codeName;
	}

	public void setCodeName(String codeName) {
		this.codeName = codeName;
	}

	@Override
	public String toString() {
		return "CodesVO [codeNo=" + codeNo + ", gidNo=" + gidNo + ", codeName=" + codeName + "]";
	}
	
}
