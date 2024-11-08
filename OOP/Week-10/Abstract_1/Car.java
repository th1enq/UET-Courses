public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * haha.
     *
     * @param branch hihi
     * @param model hihi
     * @param registrationNumber hihi
     * @param owner hihi
     * @param numberOfDoors hihi
     */
    public Car(String branch, String model, String registrationNumber, Person owner,
            int numberOfDoors) {
        super(branch, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        StringBuilder result = new StringBuilder();
        result.append("Car:");
        result.append("\n");
        result.append("\t" + "Brand: " + getBrand());
        result.append("\n");
        result.append("\t" + "Model: " + getModel());
        result.append("\n");
        result.append("\t" + "Registration Number: " + getRegistrationNumber());
        result.append("\n");
        result.append("\t" + "Number of Doors: " + numberOfDoors);
        result.append("\n");
        result.append("\t" + "Belongs to " + owner.getName() + " - " + owner.getAddress());
        return result.toString();
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    /**
     * haha.
     *
     * @param numberOfDoors hihi
     */
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
