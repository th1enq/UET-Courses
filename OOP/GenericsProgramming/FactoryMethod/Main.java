public class Main {
    public static void main(String[] args) {
        BankFactory mBankFactory = new MBBankFactory();
        Bank myMbBank = mBankFactory.createBank();
        System.out.println(myMbBank.getBankName());
    }
}
