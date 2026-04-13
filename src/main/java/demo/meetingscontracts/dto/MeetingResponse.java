package demo.meetingscontracts.dto;

import java.time.LocalDateTime;
import java.util.Set;

public record MeetingResponse(
        String uuid,
        String name,
        Set<Integer> users,
        Integer authorId,
        LocalDateTime createdAt,
        Integer duration,
        String comment,
        String link,
        MeetingStatus status
) { }
