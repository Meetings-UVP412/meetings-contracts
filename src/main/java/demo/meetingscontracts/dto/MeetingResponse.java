package demo.meetingscontracts.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record MeetingResponse(
        UUID uid,
        String name,
        List<Integer> users,
        Integer authorId,
        LocalDateTime createdAt,
        Integer duration,
        String comment,
        String link,
        MeetingStatus status
) { }
