package ar.com.integral.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@ResponseStatus(INTERNAL_SERVER_ERROR)
public class CouldNotCreateResourceException extends RuntimeException {
    public CouldNotCreateResourceException(String message) {
        super(message);
    }
}
