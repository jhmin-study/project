package com.app.project.domain;

import lombok.Getter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString
public class Period {
    private String createdDate;
    private String updatedDate;
}
