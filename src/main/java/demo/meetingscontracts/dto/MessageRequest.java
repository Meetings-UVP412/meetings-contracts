package demo.meetingscontracts.dto;

import jakarta.validation.constraints.NotBlank;

public record MessageRequest(
        @NotBlank(message = "UUID встречи не может быть пустым!") String meetingUUID,
        @NotBlank(message = "UUID чата не может быть пустым!") String chatUUID,
        MessageDTO message
) { }
