package com.comi.comi.controller;

import com.comi.comi.domain.Conversation;
import com.comi.comi.service.ConversationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/conversations")
@Api(value = "대화 관리", tags = "대화")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @PostMapping
    @ApiOperation(value = "대화 저장", response = Conversation.class)
    public Conversation saveConversation(
            @ApiParam(value = "저장될 대화 내용", required = true) @RequestBody Conversation conversation) {
        return conversationService.saveConversation(conversation);
    }

    @GetMapping("/{callId}")
    @ApiOperation(value = "통화 ID로 대화 조회", response = Conversation.class)
    public Conversation getConversationByCallId(
            @ApiParam(value = "조회할 통화 ID", required = true) @PathVariable("callId") int callId) {
        return conversationService.getConversationByCallId(callId);
    }
}
