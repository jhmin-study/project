package com.app.project.controller;

import com.app.project.domain.PostVO;
import com.app.project.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("post/*")
@Slf4j
public class PostController {
    private final PostService postService;

    @GetMapping("write")
    public void goToWriteForm(PostVO postVO) {;}

    @PostMapping("write")
    public RedirectView write(PostVO postVO) {
        postService.write(postVO);
        return new RedirectView("/post/list");
    }

    @GetMapping("list")
    public void goToList() {;}

}
