package com.app.project.service;

import com.app.project.domain.ReplyVO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{
    private final ReplyDAO replyDAO;

    @Override
    public void write(ReplyVO replyVO){replyDAO.save(replyVO);}
}
