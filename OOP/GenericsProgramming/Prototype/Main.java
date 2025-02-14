public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng Computer gốc
        Computer computer1 = new Computer("Linux", "Firefox", "Office365");

        // Hiển thị thông tin đối tượng ban đầu
        System.out.println("Original Computer: " + computer1);

        // Clone đối tượng Computer
        Computer computer2 = computer1.clone();

        // Hiển thị thông tin đối tượng đã clone
        System.out.println("Cloned Computer: " + computer2);

        // Thay đổi thuộc tính trên đối tượng clone
        if (computer2 != null) {
            computer2.setOs("Windows 11");
            computer2.setBrowser("Chrome");
            computer2.setOffice("Microsoft Office");

            // Hiển thị thông tin sau khi thay đổi thuộc tính
            System.out.println("After modification:");
            System.out.println("Original Computer: " + computer1);
            System.out.println("Cloned Computer: " + computer2);
        }
    }
}
