package egovframework.example.sample.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("deptService")
public class DeptServiceImpl extends EgovAbstractServiceImpl implements DeptService {
	
	// private static final Logger LOGGER = LoggerFactory.getLogger(EgovSampleServiceImpl.class);
	
	@Resource(name = "deptDAO")
	private DeptDAO deptDAO;
	
	// 부서 등록
	@Override
	public void insertDept(DeptVO deptVO) throws Exception {
		deptDAO.insertDept(deptVO);
	}

	// 부서 리스트
	@Override
	public List<?> deptList() throws Exception {
		return deptDAO.deptList();
	}

	// 부서 상제 정보
	@Override
	public DeptVO deptDetail(int deptNo) throws Exception {
		return deptDAO.deptDetail(deptNo);
	}

	// 부서 삭제
	@Override
	public void deptDelete(int deptNo) throws Exception {
		deptDAO.deptDelete(deptNo);
	}

	@Override
	public void deptUpdate(DeptVO deptVO) throws Exception {
		deptDAO.deptUpdate(deptVO);
	}

}