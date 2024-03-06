package com.app.project.repository;

import com.app.project.domain.PostVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class PostDaoTests {
    @Autowired
    PostDAO postDAO;

    @Test
    public void testInsert() {
        PostVO postVO = new PostVO();
        postVO.setPostTitle("테스트제목1_dao");
        postVO.setPostContent("테스트본문1_dao");
        postVO.setMemberId(2L);
        postDAO.write(postVO);
    }
}
