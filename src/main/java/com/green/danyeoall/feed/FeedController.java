package com.green.danyeoall.feed;

import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.feed.model.FeedGetReq;
import com.green.danyeoall.feed.model.FeedGetRes;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("feed")
public class FeedController {
    private final FeedService service;

    @GetMapping("main")
    @Operation(summary = "Feed 리스트 메인 화면")
    public ResultResponse<List<FeedGetRes>> selFeedListMain(@ModelAttribute FeedGetReq p) {
        List<FeedGetRes> list = service.selFeedListMain(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                             .resultMessage(String.format("%d rows", list.size()))
                             .resultData(list)
                             .build();
    }

    @GetMapping
    @Operation(summary = "Feed 리스트")
    public ResultResponse<List<FeedGetRes>> selFeedList(@ModelAttribute FeedGetReq p) {
        List<FeedGetRes> list = service.selFeedList(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                .resultMessage(String.format("%d rows", list.size()))
                .resultData(list)
                .build();
    }
}
