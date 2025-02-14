public class TranslatorAdapter implements VietNameseTarget {
    private JapaneseAdaptee japaneseAdaptee;

    TranslatorAdapter(JapaneseAdaptee japaneseAdaptee) {
        this.japaneseAdaptee = japaneseAdaptee;
    }

    String translate(String words) {
        return "Hello";
    }

    public void send(String words) {
        japaneseAdaptee.receive(this.translate(words));
    }
}
