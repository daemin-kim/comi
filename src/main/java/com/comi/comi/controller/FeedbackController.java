package com.comi.comi.controller;

import com.comi.comi.domain.Feedback;
import com.comi.comi.service.FeedbackService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
@Api(value = "피드백 관리", tags = "피드백")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    @ApiOperation(value = "피드백 저장", response = Feedback.class)
    public Feedback saveFeedback(
            @ApiParam(value = "저장될 피드백 정보", required = true) @RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/call/{callId}")
    @ApiOperation(value = "통화 ID로 피드백 조회", response = Feedback.class)
    public Feedback getFeedbackByCallId(
            @ApiParam(value = "조회할 통화 ID", required = true) @PathVariable int callId) {
        return feedbackService.getFeedbackByCallId(callId);
    }
}
