package gr.aueb.cf.cf9.part2oop.ch14.bank_app;

/**
 * Thrown when the provided SSN does not match the account holder's SSN.
 */
public class SsnNotValidException extends Exception {
    public SsnNotValidException(String message) {
        super(message);
    }
}
