package car;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<Vehicle>();
    }

    public Garage park(Vehicle vehicle) {
        this.vehicles.add(vehicle);

        return this;
    }

    public void repairAll() {
//        for (Vehicle vehicle : this.vehicles) {
//            vehicle.repair();
//        }

        this.vehicles.stream().forEach(s-> {
            s.repair();
        });
    }

    public int getVehicleCount() {

        return this.vehicles.size();
    }

}
