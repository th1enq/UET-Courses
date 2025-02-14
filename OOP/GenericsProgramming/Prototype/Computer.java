public class Computer implements Cloneable {
    private String os;
    private String browser; // Sửa từ 'browers' thành 'browser'
    private String office;

    // Constructor
    public Computer(String os, String browser, String office) {
        this.os = os;
        this.browser = browser;
        this.office = office;
    }

    // Override clone method
    @Override
    protected Computer clone() {
        try {
            return (Computer) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("Cloning not supported: " + e.getMessage());
        }
        return null;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Computer[os=" + os + ", browser=" + browser + ", office=" + office + "]";
    }

    // Getters and setters (optional, if needed)
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }
}
