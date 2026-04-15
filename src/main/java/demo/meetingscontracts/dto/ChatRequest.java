package demo.meetingscontracts.dto;

import jakarta.validation.constraints.NotBlank;

public record ChatRequest(
        @NotBlank(message = "UUID встречи не может быть пустым!") String meetingUUID,
        @NotBlank(message = "название не может быть пустым!") String name,
        MessageDTO firstMessage
) { }
