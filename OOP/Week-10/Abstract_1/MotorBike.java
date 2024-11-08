public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * haha.
     *
     * @param branch hihi
     * @param model hihi
     * @param registrationNumber hihi
     * @param owner hihi
     * @param hasSidecar hihi
     */
    public MotorBike(String branch, String model, String registrationNumber, Person owner,
            boolean hasSidecar) {
        super(branch, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        StringBuilder result = new StringBuilder();
        result.append("Motor Bike:");
        result.append("\n");
        result.append("\t" + "Brand: " + getBrand());
        result.append("\n");
        result.append("\t" + "Model: " + getModel());
        result.append("\n");
        result.append("\t" + "Registration Number: " + getRegistrationNumber());
        result.append("\n");
        result.append("\t" + "Has Side Car: " + hasSidecar);
        result.append("\n");
        result.append("\t" + "Belongs to " + owner.getName() + " - " + owner.getAddress());
        return result.toString();
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    /**
     * haha.
     *
     * @param hasSidecar hihi
     */
    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
