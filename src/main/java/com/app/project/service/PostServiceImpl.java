package com.app.project.service;

import com.app.project.repository.PostDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@RequiredArgsConstructor
public class PostServiceImpl {
    private final PostDAO postDAO;
}
