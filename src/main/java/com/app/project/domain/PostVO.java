package com.app.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ToString(callSuper = true)
public class PostVO extends Period {
    private Long id;
    private String replyContent;
    private Boolean status;
    private Long viewCount;
    private Long memberId;
}
