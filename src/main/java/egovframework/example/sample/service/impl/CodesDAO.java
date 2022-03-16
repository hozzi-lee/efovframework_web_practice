package egovframework.example.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.example.sample.service.CodesVO;
import egovframework.rte.psl.dataaccess.EgovAbstractDAO;

@Repository("codesDAO")
public class CodesDAO extends EgovAbstractDAO {
	// 코드 등록
	public void codeWrite(CodesVO codesVO) {
		insert("codeWrite", codesVO);
	}
	
	// 코드 목록
	public List<?> codeList() {
		List<?> codeList = list("codeList");
		
		return codeList;
	}
	
	// 코드 목록 개수
	public int codeListCount() {
		int codeListCount = (int)select("codeListCount");
		
		return codeListCount;
	}
	
	// 코드 삭제
	public void codeDelete(int codeNo) {
		delete("codeDelete", codeNo);
	}
	
	// 코드 세부 정보
	public CodesVO codeDetail(int codeNo) {
		CodesVO codeDetail = (CodesVO)select("codeDetail", codeNo);
		
		return codeDetail;
	}
	
	// 코드 수정
	public void codeUpdate(CodesVO codesVO) {
		update("codeUpdate", codesVO);
	}
}
