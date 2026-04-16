package demo.meetingscontracts.exceptions;

public class MeetingArchivedException extends RuntimeException {
    public MeetingArchivedException(String resource, Object id) {
        super(String.format("%s с ID %s был архивирован. Создавать новые чаты или отправлять сообщения больше невозможно", resource, id));
    }
}
