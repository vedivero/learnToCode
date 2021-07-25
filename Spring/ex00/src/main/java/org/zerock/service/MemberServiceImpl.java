package org.zerock.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

@Service
public class MemberServiceImpl implements MemberService{

	@Inject
	private MemberDAO mdao;
	
	
	@Override
	public void insertMember(MemberVO vo) {
		
		mdao.insertMember(vo);
	}

	
	@Override
	public MemberVO readMember(String userid) throws Exception {

		MemberVO vo = null;
		try {
			vo = mdao.readMember(userid);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return vo;
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}
