package com.flowintent.todo_compose_server.service;

import com.flowintent.todo_compose_server.client.GroqClient;
import com.flowintent.todo_compose_server.config.GroqProperties;
import com.flowintent.todo_compose_server.dto.GroqRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AiService {
    private final GroqClient groqClient;
    private final GroqProperties groqProperties;

    public String askAi(String userPrompt) {
        var request = new GroqRequest(
                groqProperties.model(),
                List.of(new GroqRequest.Message("user", userPrompt))
        );

        String authHeader = "Bearer " + groqProperties.key();

        var response = groqClient.getCompletion(authHeader, request);

        return response.choices().getFirst().message().content();
    }
}
