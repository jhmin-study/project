package com.app.project.mapper;

import com.app.project.domain.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface ReplyMapper {
    // 게시물에 댓글 달기
    public void insert (ReplyDTO replyDTO);

    //
}
