package com.app.project.repository;

import com.app.project.domain.PostVO;
import com.app.project.mapper.PostMapper;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PostDAO {
    private final PostMapper postMapper;

    public void write(PostVO postVO){
        postMapper.insert(postVO);
    }
}
