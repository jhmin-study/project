package com.app.project.repository;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;
import com.app.project.mapper.PostMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PostDAO {
    private final PostMapper postMapper;

    public void write(PostVO postVO){
        postMapper.insert(postVO);
    }

    public List<PostDTO> list(int offset, int rowCount) {
        return postMapper.selectAllByPage(offset, rowCount);
    }
}
