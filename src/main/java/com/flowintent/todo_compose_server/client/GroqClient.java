package com.flowintent.todo_compose_server.client;

import com.flowintent.todo_compose_server.dto.GroqRequest;
import com.flowintent.todo_compose_server.dto.GroqResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "groq-client", url = "https://api.groq.com/openai/v1")
public interface GroqClient {

    @PostMapping("/chat/completions")
    GroqResponse getCompletion(
        @RequestHeader("Authorization") String apiKey,
        @RequestBody GroqRequest request
    );
}
