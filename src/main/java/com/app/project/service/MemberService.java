package com.app.project.service;

import com.app.project.domain.MemberVO;

public interface MemberService {
    public boolean checkId(String memberEmail);

    public void join(MemberVO memberVO);

    public MemberVO login(MemberVO memberVO);

}
