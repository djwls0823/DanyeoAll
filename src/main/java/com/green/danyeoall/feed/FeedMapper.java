package com.green.danyeoall.feed;

import com.green.danyeoall.feed.model.FeedGetReq;
import com.green.danyeoall.feed.model.FeedGetRes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeedMapper {
    List<FeedGetRes> selFeedListMain(FeedGetReq p);
    List<FeedGetRes> selFeedList(FeedGetReq p);
}
