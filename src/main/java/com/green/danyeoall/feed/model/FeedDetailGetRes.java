package com.green.danyeoall.feed.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FeedDetailGetRes {
    private String title;
    private String content;
    private String startDate;
    private String endDate;
    private int peopleCnt;
    private String cityName;
    private String color;
    private long placeId;
    private int price;
    private String memo;
    private String startTime;
    private String endTime;
    private String date;
}
