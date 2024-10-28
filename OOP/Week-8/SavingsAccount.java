public class SavingsAccount extends Account {
    public SavingsAccount() {
        super();
    }

    /**
     * haha.
     *
     * @param accountNumber hihi
     * @param balance hihi
     */
    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (amount > 1000) {
                throw new InvalidFundingAmountException(amount);
            }
            if (getBalance() - amount < 5000) {
                throw new InvalidFundingAmountException(amount);
            }
            double currentBalance = balance;
            doWithdrawing(amount);
            balance -= amount;
            transactionList.add(new Transaction(4, amount, currentBalance, balance));
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            double currentBalance = balance;
            doDepositing(amount);
            balance += amount;
            transactionList.add(new Transaction(3, amount, currentBalance, balance));
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
