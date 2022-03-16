package egovframework.example.sample.web;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.sample.service.CodesService;
import egovframework.example.sample.service.CodesVO;

@Controller
@RequestMapping(value = "/codes", method = { RequestMethod.GET, RequestMethod.POST })
public class CodesController {
	
	@Resource(name = "codesService")
	private CodesService codesService;
	
	// 코드 작성 폼
	@RequestMapping("/codeWriteForm.do")
	public String codeWriteForm() {
		
		return "codes/codeWrite";
	}
	
	// 코드 등록
	@RequestMapping("/codeWrite.do")
	public String codeWrite(@ModelAttribute CodesVO codesVO) throws Exception {
		codesService.codeWrite(codesVO);
		
		return "redirect:/codes/codeList.do";
	}
	
	// 코드 목록
	@RequestMapping("/codeList.do")
	public String codeList(Model model) throws Exception {
		Map<String, Object> codeListMap = codesService.codeList();
//		int codeListCount = codesService.codeListCount();

		model.addAttribute("codeListMap", codeListMap);
//		model.addAttribute("codeList", codeList);
//		model.addAttribute("codeListCount", codeListCount);
		
		return "codes/codeList";
	}
	
	// 코드 삭제
	@RequestMapping("/codeDelete.do")
	public String codeDelete(@RequestParam("codeNo") int codeNo) throws Exception {
		codesService.codeDelete(codeNo);
		
		return "redirect:/codes/codeList.do";
	}
	
	// 코드 수정 폼
	@RequestMapping("/codeModifyForm.do")
	public String codeModifyForm(@RequestParam("codeNo") int codeNo, Model model) throws Exception {
		CodesVO codeDetail = codesService.codeDetail(codeNo);
		model.addAttribute("codeDetail", codeDetail);
		
		return "codes/codeModifyForm";
	}
	
	// 코드 수정
	@RequestMapping("/codeUpdate.do")
	public String codeUpdate(@ModelAttribute CodesVO codesVO) throws Exception {
		codesService.codeUpdate(codesVO);
		
		return "redirect:/codes/codeList.do";
	}

}
