package com.app.project.service;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;

import java.util.List;

public interface PostService {
    public void write(PostVO postVO);

    public List<PostDTO> list(int offset, int rowCount);
}