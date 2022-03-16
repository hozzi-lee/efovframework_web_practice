package egovframework.example.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.service.CodesService;
import egovframework.example.sample.service.CodesVO;

@Service("codesService")
public class CodesServiceImpl implements CodesService {
// extends EgovAbstractServiceImpl

	// private static final Logger LOGGER = LoggerFactory.getLogger(EgovSampleServiceImpl.class);

	@Resource(name = "codesDAO")
	private CodesDAO codesDAO;
	
	// 코드 등록
	@Override
	public void codeWrite(CodesVO codesVO) throws Exception {
		codesDAO.codeWrite(codesVO);
	}

	// 코드 목록
	@Override
	public Map<String, Object> codeList() throws Exception {
		List<?> codeList = codesDAO.codeList();
		int codeListCount = codesDAO.codeListCount();
		
		Map<String, Object> codeListMap = new HashMap<>();
		codeListMap.put("codeList", codeList);
		codeListMap.put("codeListCount", codeListCount);
		
		return codeListMap;
	}
	
	// 코드 목록 개수
//	@Override
//	public int codeListCount() throws Exception {
//		int codeListCount = codesDAO.codeListCount();
//		
//		return codeListCount;
//	}

	// 코드 삭제
	@Override
	public void codeDelete(int codeNo) throws Exception {
		codesDAO.codeDelete(codeNo);
	}

	// 코드 세부 정보
	@Override
	public CodesVO codeDetail(int codeNo) throws Exception {
		CodesVO codeDetail = codesDAO.codeDetail(codeNo);
		
		return codeDetail;
	}

	// 코드 수정
	@Override
	public void codeUpdate(CodesVO codesVO) throws Exception {
		codesDAO.codeUpdate(codesVO);
	}
	
}
