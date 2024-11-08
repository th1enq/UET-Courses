import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * haha.
     *
     * @param name hihi
     * @param address hihi
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * haha.
     *
     * @param vehicle hihi
     */
    public void addVehicle(Vehicle vehicle) {
        boolean exist = false;
        for (Vehicle v : vehicleList) {
            if (v.getRegistrationNumber().equals(vehicle.getRegistrationNumber())) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return;
        }
        vehicleList.add(vehicle);
    }

    /**
     * haha.
     *
     * @param registrationNumber hihi
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * haha.
     *
     * @return hihi
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return this.name + " has no vehicle!";
        }
        String result = this.name + " has:\n\n";
        for (Vehicle vehicle : vehicleList) {
            result += vehicle.getInfo() + "\n";
        }
        return result;
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
}
