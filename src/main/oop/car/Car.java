package car;

public class Car extends Vehicle {

    String name;

    String manufacturer;

    Double engineCapacity;

    public Car() {
    }

    public Car(String name, String manufacturer, Double engineCapacity) {
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
