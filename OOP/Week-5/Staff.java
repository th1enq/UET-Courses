public class Staff extends Person {
    private String school;
    private double pay;

    /**
     * constructor.
     *
     * @param name 12312
     * @param address 12321
     * @param pay 12312
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    /**
     * return school.
     *
     * @return
     */
    public String getSchool() {
        return this.school;
    }

    /**
     * return school.
     *
     * @param school 12312
     */
    public void setSchool(String school) {
        this.school = school;
    }

    /**
     * return pay.
     *
     * @return
     */
    public double getPay() {
        return this.pay;
    }

    /**
     * set pay.
     *
     * @param pay 1321312
     */
    void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
