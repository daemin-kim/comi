package com.comi.comi.service;

import com.comi.comi.domain.CallRecords;
import com.comi.comi.domain.Feedback;
import com.comi.comi.repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public Feedback getFeedbackByCallId(CallRecords callId) {
        return feedbackRepository.findByCallId(callId).orElse(null);
    }
}
