public abstract class Vehicle {
    protected String branch;
    protected String model;
    protected String registrationNumber;
    protected Person owner;

    /**
     * haha.
     *
     * @param branch hihi
     * @param model hihi
     * @param registrationNumber hihi
     * @param owner hihi
     */
    public Vehicle(String branch, String model, String registrationNumber, Person owner) {
        this.branch = branch;
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.owner = owner;
    }

    public abstract String getInfo();

    /**
     * haha.
     *
     * @param newOwner hihi
     */
    public void transferOwnership(Person newOwner) {
        owner.removeVehicle(registrationNumber);
        owner = newOwner;
        newOwner.addVehicle(this);
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getBrand() {
        return branch;
    }

    /**
     * haha.
     *
     * @param branch hihi
     */
    public void setBrand(String branch) {
        this.branch = branch;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getModel() {
        return model;
    }

    /**
     * haha.
     *
     * @param model hihi
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    /**
     * haha.
     *
     * @param registrationNumber hihi
     */
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public Person getOwner() {
        return owner;
    }

    /**
     * haha.
     *
     * @param owner hihi
     */
    public void setOwner(Person owner) {
        this.owner = owner;
    }
}
