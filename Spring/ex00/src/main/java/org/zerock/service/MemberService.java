package org.zerock.service;

import org.zerock.domain.MemberVO;

public interface MemberService {

	public void insertMember(MemberVO vo);
	
	public MemberVO readMember(String userid)throws Exception;
	
	public MemberVO readWithPW(String userid,String userpw)throws Exception;
	
}
