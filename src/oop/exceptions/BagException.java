package oop.exceptions;

// When you create an exception it should end with Exception
// Your custom exception is Strongly suggested to be extended from RuntimeException
public class BagException extends RuntimeException {
    // it is KNOWN list of codes that can appear
    private int errorCode;

    public BagException(String message, int errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public BagException(String message) {
        super(message);
        this.errorCode = 0;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
