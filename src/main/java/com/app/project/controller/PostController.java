package com.app.project.controller;

import com.app.project.domain.PostDTO;
import com.app.project.domain.PostVO;
import com.app.project.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

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
    // post/list?offset=0&rowCount=3
    public String goToList(@RequestParam (defaultValue ="0")int offset, @RequestParam (defaultValue ="2")int rowCount, Model model) {
        List<PostDTO> postList = postService.list(offset, rowCount);
        model.addAttribute("postList", postList);

        return "post/list";
    }

}
