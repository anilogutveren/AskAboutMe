package com.anil.askAboutMe.service

import com.anil.askAboutMe.client.ClaudeClient
import org.springframework.stereotype.Service

@Service
class ChatService ( private val claudeClient: ClaudeClient
){
    fun respond(
        question: String
    ): String {
        return "Response from Claude"
    }
}