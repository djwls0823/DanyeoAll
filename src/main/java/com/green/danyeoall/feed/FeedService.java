package com.green.danyeoall.feed;

import com.green.danyeoall.feed.model.FeedGetReq;
import com.green.danyeoall.feed.model.FeedGetRes;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FeedService {
    private final FeedMapper mapper;

    public List<FeedGetRes> selFeedListMain(FeedGetReq p) {
        List<FeedGetRes> list = mapper.selFeedListMain(p);
        return list;
    }

    public List<FeedGetRes> selFeedList(FeedGetReq p) {
        List<FeedGetRes> list = mapper.selFeedList(p);
        return list;
    }
}
