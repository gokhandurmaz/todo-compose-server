package com.flowintent.todo_compose_server.service;

import com.flowintent.todo_compose_server.client.GroqClient;
import com.flowintent.todo_compose_server.config.AiConfig;
import com.flowintent.todo_compose_server.dto.GroqRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AiService {

    private final GroqClient groqClient;
    private final AiConfig aiConfig;

    public String askAi(String userPrompt) {
        var request = new GroqRequest(
            "llama-3.1-8b-instant",
            List.of(new GroqRequest.Message("user", userPrompt))
        );

        var response = groqClient.getCompletion(aiConfig.getApiKey(), request);
        
        return response.choices().get(0).message().content();
    }
}
