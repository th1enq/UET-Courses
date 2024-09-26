import java.util.ArrayList;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList = new ArrayList<Transaction>();
    private String deposit = "deposit";
    private String withdraw = "withdraw";

    /**
     * Constructor for the Account class.
     *
     * @param amount 12123
     * @param operation 123213
     */
    public void addTransaction(double amount, String operation) {
        if (operation.equals(deposit)) {
            deposit(amount);
        } else if (operation.equals(withdraw)) {
            withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
    }

    /**
     * Constructor for the Account class.
     *
     * @param amount 123212
     */
    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        } else {
            balance += amount;
            transitionList.add(new Transaction(deposit, amount, balance));
        }
    }

    /**
     * Gets the balance of the Account.
     *
     * @param amount 1232132
     */
    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        } else {
            balance -= amount;
            transitionList.add(new Transaction(withdraw, amount, balance));
        }
    }

    /**
     * Gets the balance of the Account.
     *
     * @return
     */
    public void printTransaction() {
        for (int i = 0; i < transitionList.size(); i++) {
            String operation = transitionList.get(i).getOperation();
            double amount = transitionList.get(i).getAmount();
            double balance = transitionList.get(i).getBalance();
            if (operation.equals(deposit)) {
                System.out.println(
                        "Giao dich " + (i + 1) + ": Nap tien $" + String.format("%.2f", amount)
                                + ". So du luc nay: $" + String.format("%.2f", balance) + ".");
            } else {
                System.out.println(
                        "Giao dich " + (i + 1) + ": Rut tien $" + String.format("%.2f", amount)
                                + ". So du luc nay: $" + String.format("%.2f", balance) + ".");
            }
        }
    }

    /**
     * thierherne.
     *
     * @param args 12312321
     */
    public static void main(String[] args) {
        Account acc = new Account();
        acc.addTransaction(2000.255, "deposit");
        acc.addTransaction(1000, "withdraw");
        acc.printTransaction();
    }
}
