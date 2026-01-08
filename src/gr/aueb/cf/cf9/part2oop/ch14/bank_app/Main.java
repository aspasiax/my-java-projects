package gr.aueb.cf.cf9.part2oop.ch14.bank_app;

public class Main {

    public static void main(String[] args) {
        Account account = new Account(1L, "GR123", "Alice", "W.", "A100", 100.0);

        // Scenario: Insufficient Balance
        try {
            System.out.println("Attempting to withdraw 500...");
            account.withdraw(500, "A100");

        } catch (InsufficientBalanceException | NegativeAmountException | SsnNotValidException e) {
            // This message comes from Main
            System.out.println("Transaction failed. " + e.getMessage());
        }

        // Scenario: Success
        try {
            account.deposit(200);
            System.out.println("Success! " + account);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}