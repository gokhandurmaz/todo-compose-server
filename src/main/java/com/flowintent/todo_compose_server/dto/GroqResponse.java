package com.flowintent.todo_compose_server.dto;

import java.util.List;

public record GroqResponse(
    List<Choice> choices
) {
    public record Choice(Message message) {
        public record Message(String content) {}
    }
}
