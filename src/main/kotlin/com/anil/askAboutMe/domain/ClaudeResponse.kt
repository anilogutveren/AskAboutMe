package com.anil.askAboutMe.domain

data class ClaudeResponse(
    val id: String,
    val model: String,
    val content: List<ClaudeMessageContent>
)
