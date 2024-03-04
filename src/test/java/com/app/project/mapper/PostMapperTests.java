package com.app.project.mapper;

import com.app.project.domain.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostMapperTests {
    @Autowired
    PostMapper postMapper;

    @Test
    public void testInsert() {

//    memberMapper
//            .selectByMemberEmailAndMemberPassword("hds1234@gmail.com", "1234")
//            .ifPresent(memberVO -> {
//                PostVO postVO = new PostVO();
//                postVO.setMemberId(memberVO.getId());
//                postVO.setPostTitle("테스트 제목1");
//                postVO.setPostContent("테스트 내용1");
//                postMapper.insert(postVO);
//            });

        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트 제목1");
        postVO.setPostContent("테스트 본문1");
        postVO.setMemberId(1L); // 아이디 임의 입력
        postMapper.insert(postVO);
    }

}
