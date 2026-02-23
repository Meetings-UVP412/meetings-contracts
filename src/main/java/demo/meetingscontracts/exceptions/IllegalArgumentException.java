package demo.meetingscontracts.exceptions;

public class IllegalArgumentException extends RuntimeException {
    public IllegalArgumentException() {
        super("Можно загружать файлы только для новых встреч!");
    }
}
