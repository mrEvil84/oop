package car;

public class SportCar extends Car {

    public SportCar() {
        super("Sport car");
        System.out.println("Sport car constructor");
    }

    @Override
    public void repair() {
        System.out.println(super.getName());
        System.out.println("Sport car repair $$$");
    }
}
