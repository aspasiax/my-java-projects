package gr.aueb.cf.cf9.part2oop.ch14.bank_app;

/**
 * Thrown when an account does not have enough funds to complete a transaction.
 */
public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
