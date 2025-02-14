public class TechcomBankFactory extends BankFactory {
    public Bank createBank() {
        return new TechcomBank();
    }
}
