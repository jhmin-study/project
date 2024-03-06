package com.app.project.service;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;
import com.app.project.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {
    private final PostDAO postDAO;
    @Override
    public void write(PostVO postVO) {
        postDAO.write(postVO);
    }

    @Override
    public List<PostDTO> list(int offset, int rowCount) {
        return postDAO.list(offset,rowCount);
    }
}
