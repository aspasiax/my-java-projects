package gr.aueb.cf.cf9.part2oop.ch14.bank_app;

/**
 * Thrown when a transaction is attempted with a negative amount.
 */
public class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
