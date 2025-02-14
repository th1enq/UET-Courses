public class VietNameseClient {
    public static void main(String[] args) {
        TranslatorAdapter adapter = new TranslatorAdapter(new JapaneseAdaptee());
        adapter.send("Xin chao");

    }
}
