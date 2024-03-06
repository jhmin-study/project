package com.app.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter @ToString(callSuper = true)
public class ReplyVO extends Period{
    private Long id;
    private String reply_Content;
    private Boolean status;
    private Long memberId;
    private Long postId;
}
