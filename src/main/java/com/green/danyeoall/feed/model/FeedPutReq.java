package com.green.danyeoall.feed.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedPutReq {
    private long planMasterId;
    private long userId;
    private String content;
    private String title;
}
