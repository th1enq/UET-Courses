import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Bank {
    private final List<Customer> customerList;

    public Bank() {
        customerList = new ArrayList<>();
    }

    /**
     * haha.
     *
     * @param inputStream hihi
     */
    public void readCustomerList(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String inputString;
        Customer currentCustomer = null;

        while (true) {
            try {
                if ((inputString = reader.readLine()) == null) {
                    break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            String[] customerInfos = inputString.split(" ");

            if (customerInfos[0].matches("\\d+")) {
                long accountNumber = Long.parseLong(customerInfos[0]);
                String type = customerInfos[1];
                double amount = Double.parseDouble(customerInfos[2]);
                Account account = null;
                if (type.equals("CHECKING")) {
                    account = new CheckingAccount(accountNumber, amount);
                } else {
                    try {
                        if (amount < 5000) {
                            throw new InvalidFundingAmountException(amount);
                        }
                        account = new SavingsAccount(accountNumber, amount);
                    } catch (InvalidFundingAmountException e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (account != null) {
                    currentCustomer.addAccount(account);
                }
            } else {
                StringBuilder fullname = new StringBuilder();
                for (int i = 0; i <= customerInfos.length - 2; i++) {
                    fullname.append(customerInfos[i]);
                    if (i < customerInfos.length - 2) {
                        fullname.append(" ");
                    }
                }
                long idNumber = Long.parseLong(customerInfos[customerInfos.length - 1]);
                if (currentCustomer != null) {
                    customerList.add(currentCustomer);
                }
                currentCustomer = new Customer(idNumber, fullname.toString());
            }
        }
        if (currentCustomer != null) {
            customerList.add(currentCustomer);
        }
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getCustomersInfoByIdOrder() {
        return customerList.stream().sorted(Comparator.comparing(Customer::getIdNumber))
                .map(Customer::getCustomerInfo).collect(Collectors.joining("\n"));
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getCustomersInfoByNameOrder() {
        return customerList.stream().sorted(Comparator.comparing(Customer::getFullName))
                .map(Customer::getCustomerInfo).collect(Collectors.joining("\n"));
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public List<Customer> getCustomerList() {
        return customerList;
    }
}
