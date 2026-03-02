package com.flowintent.todo_compose_server.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiConfig {
    @Value("${groq.api.key}")
    private String apiKey;

    public String getApiKey() {
        return "Bearer " + apiKey;
    }
}
