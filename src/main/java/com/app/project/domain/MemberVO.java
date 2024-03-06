package com.app.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ToString(callSuper = true)
public class MemberVO extends Period{
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    private Boolean status;
}

