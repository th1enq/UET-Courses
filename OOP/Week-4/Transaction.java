public class Transaction {
    private String operation;
    private double amount;
    private double balance;
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Constructor for the Transaction class.
     *
     * @param operation 123213
     * @param amount 1232
     * @param balance 112
     */
    Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    /**
     * Gets the operation of the Transaction.
     *
     * @return
     */
    public double getAmount() {
        return this.amount;
    }

    /**
     * Sets the operation of the Transaction.
     *
     * @param amount the value to set as the operation
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Gets the balance of the Transaction.
     *
     * @return
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Sets the balance of the Transaction.
     *
     * @param balance the value to set as the balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets the operation of the Transaction.
     *
     * @return
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * Sets the operation of the Transaction.
     *
     * @param operation the value to set as the operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }
}
