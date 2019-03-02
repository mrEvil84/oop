package car;

public class CarApp {

    public static void main(String[] args) {

        Garage garage = new Garage();

        garage.park(new Vehicle())
        .park(new Car())
        .park(new Bike())
        .park(new SportCar());

        garage.repairAll();
    }
}
