package co.com.tata.reto.advantageonlineshopping.exceptions;

public class UserLoginException extends AssertionError{
    public static final String MESSAGE_USER_NOT_FOUND = "The user that was created does not match";
    public UserLoginException(String message, Throwable cause) {
        super(message, cause);
    }
}
