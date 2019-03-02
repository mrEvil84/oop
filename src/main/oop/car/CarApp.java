package car;

public class CarApp {

    public static void main(String[] args) {

        Garage garage = new Garage();

        garage.add(new Vehicle());
        garage.add(new Car());
        garage.add(new Bike());
        garage.add(new SportCar());

        garage.repairAll();
    }
}
