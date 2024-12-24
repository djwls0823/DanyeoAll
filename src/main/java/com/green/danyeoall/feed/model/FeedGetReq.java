package com.green.danyeoall.feed.model;

import com.green.danyeoall.common.model.Paging;
import lombok.Getter;

@Getter
public class FeedGetReq extends Paging {
    public FeedGetReq(Integer page, Integer size) {
        super(page, size);
    }
}
