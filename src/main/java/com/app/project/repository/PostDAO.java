package com.app.project.repository;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;
import com.app.project.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import lombok.NoArgsConstructor;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostDAO {
    private final PostMapper postMapper;

    public void save(PostVO postVO) {postMapper.insert(postVO);}

    public Optional<PostDTO> findById(Long id) {return postMapper.selectById(id);}

    public void increaseViewCount(Long id) {postMapper.updateViewCount(id);}

    public void write(PostVO postVO){
        postMapper.insert(postVO);
    }

    public List<PostDTO> list(int offset, int rowCount) {
        return postMapper.selectAllByPage(offset, rowCount);
    }
}
