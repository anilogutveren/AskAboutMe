package com.anil.askAboutMe.service

import com.anil.askAboutMe.client.ClaudeClient
import org.springframework.stereotype.Service

@Service
class ChatService ( private val claudeClient: ClaudeClient
){
    fun respond(
        question: String,
        context: String,
        model: String,
        temperature: Double,
        maxTokens: Int
    ): String {

        return "Response from Claude"
    }
}