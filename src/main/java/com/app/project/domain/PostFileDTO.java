package com.app.project.domain;

import com.app.project.domain.Period;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;

@Component
@Getter @Setter @ToString(callSuper = true)
public class PostFileDTO extends Period{
    private Long id;
    private String filePath;
    private String fileType;
    private Long postId;

    public byte[] getBytes() throws IOException {
        return FileCopyUtils.copyToByteArray(new File("C:/upload", this.getFilePath()));
    }
}

