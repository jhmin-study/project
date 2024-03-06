package com.app.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @ToString(callSuper = true)
public class ReplyDTO extends Period{
    private Long id;
    private String reply_Content;
    private Boolean status;
    private Long postId;
    private String postTitle;
    private String postContent;
    private Integer viewCount;
}
