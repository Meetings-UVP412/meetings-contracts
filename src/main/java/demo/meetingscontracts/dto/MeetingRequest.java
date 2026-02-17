package demo.meetingscontracts.dto;

import jakarta.validation.constraints.NotBlank;
import java.util.List;

public record MeetingRequest(
        @NotBlank(message = "Название не может быть пустым") String name,
        @NotBlank List<Integer> users,
        @NotBlank Integer authorId
) { }
