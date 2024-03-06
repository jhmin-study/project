package com.app.project.mapper;

import com.app.project.domain.MemberVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;
@Mapper
public interface MemberMapper {
    // 회원 조회 (이메일로 조회)
    public Optional<MemberVO> selectByMemberEmail(String memberEmail);

    // 회원 조회 (이메일과 비밀번호로 조회)
    public Optional<MemberVO> selectByEmailAndMemberPassword(String memberEmail, String memberPassword);

    // 회원 추가
    public void insert(MemberVO memberVO);
}
