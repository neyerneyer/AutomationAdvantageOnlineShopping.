package co.com.tata.reto.advantageonlineshopping.exceptions;

public class InformationSentException extends AssertionError{
    public static final String MESSAGE_WAS_NOT_SENT = "message was not sent";
    public InformationSentException(String message, Throwable cause) {
        super(message, cause);
    }
}
