package com.app.project.service;

import com.app.project.domain.MemberVO;
import com.app.project.exception.LoginFailException;
import com.app.project.repository.MemberDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.security.auth.login.LoginException;
import java.lang.reflect.Member;

@Service
@RequiredArgsConstructor
@Primary
public class MemberServiceImpl implements MemberService{
    private final MemberDAO memberDAO;

    @Override
    public boolean checkId(String memberEmail){return memberDAO.findByMemberEmail(memberEmail).isEmpty();}

    @Override
    public void join(MemberVO memberVO) {memberDAO.save(memberVO);}

    @Override
    public MemberVO login(MemberVO memberVO) {
        return memberDAO.findByMemberEmailAndMemberPassword(memberVO.getMemberEmail(), memberVO.getMemberPassword())
                .orElseThrow(() -> {throw new LoginFailException("로그인 실패");});
    }

}
