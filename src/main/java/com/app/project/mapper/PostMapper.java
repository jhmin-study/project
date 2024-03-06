package com.app.project.mapper;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface PostMapper {
    // 게시글 추가
    public void insert(PostVO postVO);

    // 게시글 조회
    public Optional<PostDTO> selectById(Long id);

    // 게시글 조회수 증가
    public void updateViewCount(Long id);
}
