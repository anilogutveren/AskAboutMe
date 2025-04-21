package com.anil.askAboutMe.domain

data class ClaudeRequest(
    val model: String,
    val messages: List<Map<String, String>>,
    val max_tokens: Int
)

