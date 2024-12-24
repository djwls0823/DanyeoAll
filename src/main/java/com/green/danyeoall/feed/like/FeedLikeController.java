package com.green.danyeoall.feed.like;

import com.green.danyeoall.common.model.ResultResponse;
import com.green.danyeoall.feed.like.model.FeedLikeReq;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("feed/like")
public class FeedLikeController {
    private final FeedLikeService feedLikeService;

    @PostMapping
    public ResultResponse<Integer> postFeedLike(@RequestBody FeedLikeReq p) {
        int result = feedLikeService.postFeedLike(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("좋아요 등록")
                .resultData(result)
                .build();
    }

    @DeleteMapping
    public ResultResponse<Integer> deleteFeedLike(@ModelAttribute FeedLikeReq p) {
        int result = feedLikeService.deleteFeedLike(p);
        return ResultResponse.<Integer>builder()
                .resultMessage("좋아요 취소")
                .resultData(result)
                .build();
    }
}
