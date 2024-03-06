package com.app.project.service;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;

public interface PostService {
    public void write(PostVO postVO);

    public PostDTO read(Long id);

}
