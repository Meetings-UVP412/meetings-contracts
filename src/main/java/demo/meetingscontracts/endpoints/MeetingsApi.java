package demo.meetingscontracts.endpoints;

import demo.meetingscontracts.dto.MeetingRequest;
import demo.meetingscontracts.dto.MeetingResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/meetings")
public interface MeetingsApi {

    @Tag(name = "Meeting", description = "Встречи")
    @Operation(summary = "Получение встречи по id")
    @ApiResponse(responseCode = "200", description = "Информация о встрече")
    @ApiResponse(responseCode = "404", description = "Встреча на найдена!")
    @GetMapping("/{uuid}")
    MeetingResponse getMeeting(@PathVariable UUID uuid);

    @Tag(name = "Meeting", description = "Встречи")
    @Operation(summary = "Создание встречи")
    @ApiResponse(responseCode = "201", description = "Встреча успешно создана!")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    MeetingResponse createMeeting(@RequestBody MeetingRequest request);

}
