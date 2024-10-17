public class Person {
    private String name;
    private String address;

    /**
     * Constructor for the Person class.
     *
     * @param name 1321
     * @param address 12312
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * return name.
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * set name.
     *
     * @param name 1321
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * return address.
     *
     * @return
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * set adress.
     *
     * @param address 12321
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * return string.
     *
     * @return
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}
