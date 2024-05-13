package com.comi.comi.service;

import com.comi.comi.domain.Conversation;
import com.comi.comi.repository.ConversationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConversationService {

    @Autowired
    private ConversationRepository conversationRepository;

    public Conversation saveConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }

    public Conversation getConversationByCallId(Conversation callId) {
        return conversationRepository.findByCallId(callId).orElse(null);
    }
}
