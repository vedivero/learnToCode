package org.zerock.web;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.zerock.domain.MemberVO;
import org.zerock.service.MemberService;

@Controller
@RequestMapping(value = "/member/*")
public class MemberController {

	@Inject
	private MemberService service;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	@RequestMapping(value = "/insert",method = RequestMethod.GET)
	public String insertMember()throws Exception{
		
		return "/member/insertMember";
	}
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
	public String insertMemberForm(MemberVO vo)throws Exception{
		
		service.insertMember(vo);
		return "redirect:/member/loginForm";
	}
	
}