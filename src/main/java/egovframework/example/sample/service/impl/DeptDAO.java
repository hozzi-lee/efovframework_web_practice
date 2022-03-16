package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.DeptVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("deptDAO")
public class DeptDAO extends EgovAbstractDAO {

	// 부서 등록
	public void insertDept(DeptVO deptVO) {
		insert("deptDAO.insertDept", deptVO);
	}
	
	// 부서 리스트
	public List<?> deptList() {
		return list("deptDAO.deptList");
	}
	
	// 부서 상제 정보
	public DeptVO deptDetail(int deptNo) {
		return (DeptVO)select("deptDAO.deptDetail", deptNo);
	}
	
	// 부서 삭제
	public void deptDelete(int deptNo) {
		delete("deptDAO.deptDelete", deptNo);
	}
	
	// 부서 정보 수정
	public void deptUpdate(DeptVO deptVO) {
		update("deptDAO.deptUpdate", deptVO);
	}
}