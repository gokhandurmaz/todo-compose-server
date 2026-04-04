package com.flowintent.todo_compose_server.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "groq.api")
public record GroqProperties(String key) {
}
