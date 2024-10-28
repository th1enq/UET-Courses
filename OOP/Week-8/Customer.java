import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private final List<Account> accountList;

    public Customer() {
        accountList = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @param idNumber hihi
     * @param fullName hihi
     */
    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        accountList = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getCustomerInfo() {
        return "Số CMND: " + idNumber + ". Họ tên: " + fullName + ".";
    }

    /**
     * haha.
     *
     * @param account hihi
     */
    public void addAccount(Account account) {
        accountList.add(account);
    }

    /**
     * haha.
     *
     * @param account hihi
     */
    public void removeAccount(Account account) {
        accountList.remove(account);
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public long getIdNumber() {
        return idNumber;
    }

    /**
     * haha.
     *
     * @param idNumber hihi
     */
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * haha.
     *
     * @param fullName hihi
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public List<Account> getAccountList() {
        return accountList;
    }

    @Override
    public String toString() {
        return "Customer{" + "idNumber=" + idNumber + ", fullName='" + fullName + '\''
                + ", accountList=" + accountList + '}';
    }
}
