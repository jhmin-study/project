package com.app.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Pagination {
    private Integer page;
    private int offset;
    private int rowCount;
    private int pageCount;
    private int startPage;
    private int endPage;
    private int realEnd;
    private boolean prev, next;
    private int total;
    private String keyword;

    public void progress() {
        this.page = page == null ? 1 : page;
        this.rowCount = 10;
        this.pageCount = 10;
        this.offset = (page - 1) * 10;
        this.endPage = (int)(Math.ceil(page / (double)pageCount) * pageCount);
        this.startPage = endPage - pageCount + 1;
        this.realEnd = (int)Math.ceil(total / (double)rowCount);
        if(realEnd < endPage) {
            endPage = realEnd;
        }

        if (realEnd == 0){
            endPage = 1;
        }

        this.prev = startPage > 1;
        this.next = endPage < realEnd;
    }
}
