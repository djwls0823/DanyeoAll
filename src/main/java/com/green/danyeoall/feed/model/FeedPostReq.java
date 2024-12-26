package com.green.danyeoall.feed.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FeedPostReq {
    private long planMasterId;
    private String content;
    private String title;
    private String location;
}
