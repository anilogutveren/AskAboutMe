package com.anil.askAboutMe.client

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class RestTemplateConfig {
    /**
     * Bean configuration for RestTemplate.
     * This bean can be injected into other components to make HTTP requests.
     */
    @Bean
    fun restTemplate(): RestTemplate = RestTemplate()
}