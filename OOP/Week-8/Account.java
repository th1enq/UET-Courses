import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    public static final String CHECKING = "Checking";
    public static final String SAVINGS = "Savings";
    protected long accountNumber;
    protected double balance;
    protected List<Transaction> transactionList;

    public Account() {
        transactionList = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @param accountNumber hihi
     * @param balance hihi
     */
    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionList = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public double getBalance() {
        return balance;
    }

    /**
     * haha.
     *
     * @param amount hihi
     */
    public void doWithdrawing(double amount)
            throws InsufficientFundsException, InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount);
        }
    }

    /**
     * haha.
     *
     * @param amount hihi
     */
    public void doDepositing(double amount) throws InvalidFundingAmountException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
    }

    /**
     * haha.
     *
     * @param amount hihi
     */
    public abstract void withdraw(double amount);

    /**
     * haha.
     *
     * @param amount hihi
     */
    public abstract void deposit(double amount);

    /**
     * haha.
     *
     * @return hihi
     */
    public String getTransactionHistory() {
        if (transactionList == null) {
            transactionList = new ArrayList<>();
        }
        StringBuilder result =
                new StringBuilder("Lịch sử giao dịch của tài khoản " + accountNumber + ":\n");
        for (Transaction transaction : transactionList) {
            result.append(transaction.getTransactionSummary()).append("\n");
        }
        return result.toString();
    }

    /**
     * haha.
     *
     * @param transaction hihi
     */
    public void addTransaction(Transaction transaction) {
        if (transactionList == null) {
            transactionList = new ArrayList<>();
        }
        transactionList.add(transaction);
    }

    @Override
    public boolean equals(Object others) {
        if (this == others) {
            return true;
        }
        if (others == null || getClass() != others.getClass()) {
            return false;
        }
        Account account = (Account) others;
        return accountNumber == account.accountNumber;
    }

    @Override
    public String toString() {
        return "Account{" + "accountNumber=" + accountNumber + ", balance=" + balance
                + ", transactionList=" + transactionList + '}';
    }
}
