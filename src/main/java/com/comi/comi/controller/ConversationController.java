package com.comi.comi.controller;

import com.comi.comi.domain.Conversation;
import com.comi.comi.service.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/conversations")
public class ConversationController {

    @Autowired
    private ConversationService conversationService;

    @PostMapping
    public Conversation saveConversation(@RequestBody Conversation conversation) {
        return conversationService.saveConversation(conversation);
    }

    @GetMapping("/{callId}")
    public Conversation getConversationByCallId(@PathVariable Conversation callId) {
        return conversationService.getConversationByCallId(callId);
    }
}
