package co.com.tata.reto.advantageonlineshopping.exceptions;

public class UserRegistrationException extends AssertionError{
    public static final String MESSAGE_NOT_FOUND = "No coincide el usuario que se creo";
    public UserRegistrationException(String message, Throwable cause) {
        super(message, cause);
    }
}
