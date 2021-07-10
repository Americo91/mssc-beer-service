package guru.springframework.msscbeerservice.exceptions;

/**
 * Created by @author stopp on 04/07/2021
 */
public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException() {
    }
}
