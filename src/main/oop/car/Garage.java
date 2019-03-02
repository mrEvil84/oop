package car;

import java.util.ArrayList;
import java.util.List;

public class Garage {


    private List<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<Vehicle>();
    }

    public Garage add(Vehicle vehicle) {
        this.vehicles.add(vehicle);

        return this;
    }

    public void repairAll() {
        for (Vehicle vehicle : this.vehicles) {
            vehicle.repair();
        }
    }

}
