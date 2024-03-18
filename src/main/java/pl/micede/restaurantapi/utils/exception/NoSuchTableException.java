package pl.micede.restaurantapi.utils.exception;

public class NoSuchTableException extends RuntimeException{
    public NoSuchTableException(String message) {
        super(message);
    }
}
