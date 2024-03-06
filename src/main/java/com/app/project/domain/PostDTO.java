package com.app.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString(callSuper = true)
public class PostDTO extends Period {
    private Long id;
    private String postTitle;
    private String postContent;
    private Integer viewCount;
    private Long memberId;
    private String memberEmail;
    private String memberName;
}
