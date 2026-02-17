package demo.meetingscontracts.dto;

public enum MeetingStatus {
    NEW("Новая"),
    END("Завершена"),
    PROCESSED("Обработана"),
    ARCHIVED("Архивирована");

    private final String value;

    MeetingStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
