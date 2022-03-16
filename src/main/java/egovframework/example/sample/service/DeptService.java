package egovframework.example.sample.service;

import java.util.List;

public interface DeptService {
	
	// 부서 등록
	public void insertDept(DeptVO deptVO) throws Exception;
	// 부서 리스트
	public List<?> deptList() throws Exception;
	// 부서 상세 정보
	public DeptVO deptDetail(int deptNo) throws Exception;
	// 부서 삭제
	public void deptDelete(int deptNo) throws Exception;
	// 부서 정보 수정
	public void deptUpdate(DeptVO deptVO) throws Exception;
}
