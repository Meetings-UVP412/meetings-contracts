package demo.meetingscontracts.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.List;

public record UpdateMessagesRequest(
        @NotBlank String chatId,
        List<MessageDTO> messages
) {}
