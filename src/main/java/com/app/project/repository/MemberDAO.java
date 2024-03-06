package com.app.project.repository;

import com.app.project.domain.MemberVO;
import com.app.project.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class MemberDAO {
    private final MemberMapper memberMapper;

    public Optional<MemberVO> findByMemberEmail(String memberEmail) {
        return memberMapper.selectByMemberEmail(memberEmail);
    }

    public void save(MemberVO memberVO) {memberMapper.insert(memberVO);}

    public Optional<MemberVO> findByMemberEmailAndMemberPassword(String memberEmail, String memberPassword) {
        return memberMapper.selectByEmailAndMemberPassword(memberEmail, memberPassword);
    }
}
