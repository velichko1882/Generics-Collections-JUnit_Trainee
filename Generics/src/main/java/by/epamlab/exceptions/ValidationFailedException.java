package by.epamlab.exceptions;

public class ValidationFailedException extends Exception {

    public ValidationFailedException() {
    }

    public ValidationFailedException(String message) {
        super(message);
    }
}
