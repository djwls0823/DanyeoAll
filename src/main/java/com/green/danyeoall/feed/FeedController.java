package com.green.danyeoall.feed;

import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.feed.model.*;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Result;
import java.util.List;

@RequiredArgsConstructor
@RestController
@Slf4j
@RequestMapping("feed")
public class FeedController {
    private final FeedService service;

    @PostMapping
    @Operation(summary = "Feed 등록")
    public ResultResponse<Integer> insFeed(@RequestBody FeedPostReq p) {
        int result = service.insFeed(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("피드 등록 완료")
                             .resultData(result)
                             .build();
    }

    @GetMapping("main")
    @Operation(summary = "Feed 리스트 메인 화면")
    public ResultResponse<List<FeedGetRes>> selFeedListMain(@ParameterObject FeedGetReq p) {
        List<FeedGetRes> list = service.selFeedListMain(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                             .resultMessage(String.format("%d rows", list.size()))
                             .resultData(list)
                             .build();
    }

    @GetMapping
    @Operation(summary = "Feed 리스트")
    public ResultResponse<List<FeedGetRes>> selFeedList(@ParameterObject FeedGetReq p) {
        log.info("aaaaaaaaaaaaaaaaa : {}", p);
        List<FeedGetRes> list = service.selFeedList(p);
        return ResultResponse.<List<FeedGetRes>>builder()
                .resultMessage(String.format("%d rows", list.size()))
                .resultData(list)
                .build();
    }

    @GetMapping("feed/detail")
    @Operation(summary = "Feed 상세 정보")
    public ResultResponse<FeedDetailGetRes> selFeedDetail(@ParameterObject FeedDetailGetReq p) {
        FeedDetailGetRes res = service.selFeedDetail(p);
        return ResultResponse.<FeedDetailGetRes>builder()
                             .resultMessage("피드 상세 정보")
                             .resultData(res)
                             .build();
    }

    @PutMapping
    @Operation(summary = "Feed 수정")
    public ResultResponse<Integer> updFeed(@RequestBody FeedPutReq p) {
        int result = service.updFeed(p);
        return ResultResponse.<Integer>builder()
                             .resultMessage("피드 수정 완료")
                             .resultData(result)
                             .build();
    }
}
