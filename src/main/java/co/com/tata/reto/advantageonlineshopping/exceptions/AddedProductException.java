package co.com.tata.reto.advantageonlineshopping.exceptions;

public class AddedProductException extends AssertionError{
    public static final String NOT_SENT = "message was not sent";
    public AddedProductException(String message, Throwable cause) {
        super(message, cause);
    }
}
