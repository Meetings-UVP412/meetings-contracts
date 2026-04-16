package demo.meetingscontracts.dto;

import java.util.List;

public record UpdateMessagesRequest(
        List<MessageDTO> messages
) {}
