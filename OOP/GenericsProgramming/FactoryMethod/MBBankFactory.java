public class MBBankFactory extends BankFactory {
    public Bank createBank() {
        return new MBBank();
    }
}
