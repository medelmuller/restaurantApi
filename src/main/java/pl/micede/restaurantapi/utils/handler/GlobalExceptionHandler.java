package pl.micede.restaurantapi.utils.handler;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pl.micede.restaurantapi.utils.exception.NoSuchTableException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchTableException.class)
    public ResponseEntity<Object> handleEntityNotFound(NoSuchTableException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
