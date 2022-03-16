package egovframework.example.sample.service;

import java.util.Map;

public interface CodesService {
	// 코드 등록
	public void codeWrite(CodesVO codesVO) throws Exception;
	// 코드 목록
	public Map<String, Object> codeList() throws Exception;
	// 코드 목록 개수
//	public int codeListCount() throws Exception;
	// 코드 삭제
	public void codeDelete(int codeNo) throws Exception;
	// 코드 세부 정보
	public CodesVO codeDetail(int codeNo) throws Exception;
	// 코드 수정
	public void codeUpdate(CodesVO codesVO) throws Exception;
}
