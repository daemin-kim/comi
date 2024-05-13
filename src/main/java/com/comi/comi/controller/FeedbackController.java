package com.comi.comi.controller;

import com.comi.comi.domain.Feedback;
import com.comi.comi.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/call/{callId}")
    public Feedback getFeedbackByCallId(@PathVariable Feedback callId) {
        return feedbackService.getFeedbackByCallId(callId.getCallId());
    }
}
