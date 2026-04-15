package demo.meetingscontracts.dto;

import java.time.LocalDateTime;
import java.util.List;

public record ChatDTO(
        String uuid,
        String title,
        List<MessageDTO> messages,
        LocalDateTime createdAt
) {}
