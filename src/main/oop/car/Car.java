package car;

public class Car extends Vehicle {

    String name;

    String manufacturer;

    Double engineCapacity;

    public Car(String name) {
        super(name);
        this.name = name;
    }

    public Car() {
        super("Car");
    }

    public Car(String name, String manufacturer, Double engineCapacity) {
        super("Car");
        this.name = name;
        this.manufacturer = manufacturer;
        this.engineCapacity = engineCapacity;
    }


    @Override
    public void repair() {
        System.out.println("Car repair $$ ");
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }
}
