public class CheckingAccount extends Account {
    public CheckingAccount() {
        super();
    }

    /**
     * haha.
     *
     * @param accountNumber hihi
     * @param balance hihi
     */
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        try {
            double currentBalance = balance;
            doWithdrawing(amount);
            balance -= amount;
            transactionList.add(new Transaction(2, amount, currentBalance, balance));
        } catch (InsufficientFundsException | InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deposit(double amount) {
        try {
            double currentBalance = balance;
            doDepositing(amount);
            balance += amount;
            transactionList.add(new Transaction(1, amount, currentBalance, balance));
        } catch (InvalidFundingAmountException e) {
            System.out.println(e.getMessage());
        }
    }
}
