package com.anil.askAboutMe.service

import com.anil.askAboutMe.client.ClaudeClient
import com.anil.askAboutMe.entity.QuestionAnswerPairEntity
import com.anil.askAboutMe.repository.QuestionAnswerRepository
import org.springframework.stereotype.Service

@Service
class ChatService (
    private val claudeClient: ClaudeClient,
    private val questionAnswerRepository: QuestionAnswerRepository
){
    fun respond(
        question: String
    ): String {

        return "Response from Claude"
    }
}