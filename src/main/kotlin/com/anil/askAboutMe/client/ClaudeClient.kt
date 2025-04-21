package com.anil.askAboutMe.client

import com.anil.askAboutMe.domain.ClaudeRequest
import com.anil.askAboutMe.domain.ClaudeResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpMethod
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@Component
class ClaudeClient(
    private val restTemplate: RestTemplate,
    @Value("\${claude.api.key}") private val apiKey: String
) {

    private val apiUrl = "https://api.anthropic.com/v1/messages"

    fun chatWithClaude(prompt: String): ClaudeResponse? {
        val requestBody = ClaudeRequest(
            model = "claude-3-opus-20240229",
            messages = listOf(mapOf("role" to "user", "content" to prompt)),
            max_tokens = 1000
        )

        val headers = HttpHeaders().apply {
            contentType = MediaType.APPLICATION_JSON
            set("x-api-key", apiKey)
            set("anthropic-version", "2023-06-01")
        }

        val requestEntity = HttpEntity(requestBody, headers)

        val responseEntity: ResponseEntity<ClaudeResponse> =
            restTemplate.exchange(apiUrl, HttpMethod.POST, requestEntity, ClaudeResponse::class.java)

        return responseEntity.body
    }
}