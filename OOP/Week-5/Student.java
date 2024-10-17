public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    /**
     * constructor.
     *
     * @param name 12312
     * @param address 12312
     * @param program 12312
     * @param year 12312
     * @param fee 1321
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    /**
     * dep trai1.
     *
     * @return
     */
    public String getProgram() {
        return this.program;
    }

    /**
     * dep trai.
     *
     * @param program 12312
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     * dep trai.
     *
     * @return 12312321
     */
    public int getYear() {
        return this.year;
    }

    /**
     * deptrai.
     *
     * @param year 1221
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * deptrai.
     *
     * @return
     */
    public double getFee() {
        return this.fee;
    }

    /**
     * deptrai.
     *
     * @param fee 1321321
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee="
                + fee + "]";
    }
}
