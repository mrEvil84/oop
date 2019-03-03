package car;

public class Bike extends Vehicle {

    public Bike() {
        super("Bike");
    }

    @Override
    public void repair() {
        System.out.println("Bike repair $");
    }
}
