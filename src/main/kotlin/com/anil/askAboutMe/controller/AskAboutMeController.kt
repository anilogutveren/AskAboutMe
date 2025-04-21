package com.anil.askAboutMe.controller

import com.anil.askAboutMe.service.ChatService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/askAboutMe")
class AskAboutMeController(private val chatService: ChatService)  {

    @PostMapping("/askClaude")
    fun askToClaude(
        question: String,
        context: String,
        model: String,
        temperature: Double,
        maxTokens: Int
    ): String {
        // Implement the logic to interact with the Claude model here
        return chatService.respond(
            question = question,
            context = context,
            model = model,
            temperature = temperature,
            maxTokens = maxTokens
        )
    }
}