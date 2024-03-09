package com.app.project.mapper;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {
    // 게시글 조회
    public Optional<PostDTO> selectById(Long id);

    // 게시글 조회수 증가
    public void updateViewCount(Long id);
  
    // 게시글 작성
    public void insert(PostVO postVO);
    
    // 게시물 목록
    public List<PostDTO> selectAllByPage(int offset, int rowCount);
}
