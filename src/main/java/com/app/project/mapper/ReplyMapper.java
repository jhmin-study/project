package com.app.project.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReplyMapper {
    // 게시물에 댓글 달기
    public void insert (ReplyDTO replyDTO);

}
