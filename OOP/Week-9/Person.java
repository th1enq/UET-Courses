public class Person implements Comparable<Person> {
    protected String name;
    protected int age;
    protected String address;

    public Person() {

    }

    /**
     * haha.
     *
     * @param name hihi
     * @param age hihi
     * @param address hihi
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getName() {
        return name;
    }

    /**
     * haha.
     *
     * @param name hihi
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getAge() {
        return age;
    }

    /**
     * haha.
     *
     * @param age hihi
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getAddress() {
        return address;
    }

    /**
     * haha.
     *
     * @param address hihi
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Person other) {
        return (this.getName().equals(other.getName())) ? this.getAge() - other.getAge()
                : this.getName().compareTo(other.getName());
    }
}
