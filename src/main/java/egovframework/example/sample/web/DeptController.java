package egovframework.example.sample.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import egovframework.example.sample.service.DeptService;
import egovframework.example.sample.service.DeptVO;

@Controller
@RequestMapping(value = "/dept", method = {RequestMethod.GET, RequestMethod.POST})
public class DeptController {
	
	@Resource(name = "deptService")
	private DeptService deptService;
	
	@RequestMapping("/deptWrite.do")
	public String deptWrite() {
		return "dept/deptWrite";
	}
	
	// 부서 등록
	@RequestMapping("/deptWriteSave.do")
	public String deptWriteSave(@ModelAttribute DeptVO deptVO) throws Exception {
		deptService.insertDept(deptVO);
		
		return "redirect:/dept/deptList.do";
	}
	
	// 부서 리스트
	@RequestMapping("/deptList.do")
	public String deptList(Model model) throws Exception {
		List<?> deptList = deptService.deptList();
		model.addAttribute("deptList", deptList);
		
		return "dept/deptList";
	}
	
	// 부서 상제 정보
	@RequestMapping("/deptDetail.do")
	public String deptDetail(@RequestParam("deptNo") int deptNo, Model model) throws Exception {
		DeptVO deptDetail = deptService.deptDetail(deptNo);
		model.addAttribute("deptDetail", deptDetail);
		
		return "dept/deptDetail";
	}
	
	// 부서 삭제
	@RequestMapping("/deptDelete.do")
	public String deptDelete(@RequestParam("deptNo") int deptNo, Model model) throws Exception {
		deptService.deptDelete(deptNo);
		
		return "redirect:/dept/deptList.do";
	}
	
	// 부서 정보 수정 폼
	@RequestMapping("/deptModify.do")
	public String deptModifyInfo(@RequestParam("deptNo") int deptNo, Model model) throws Exception {
		DeptVO deptModifyInfo = deptService.deptDetail(deptNo);
		model.addAttribute("deptModifyInfo", deptModifyInfo);
		
		return "dept/deptModify";
	}
	
	// 부서 정보 수정
	@RequestMapping("/deptUpdate.do")
	public String deptUpdate(@ModelAttribute DeptVO deptVO) throws Exception {
		deptService.deptUpdate(deptVO);
		
		return "redirect:/dept/deptList.do";
	}
}