package car;

public class Car {

    String name;

    String manufacturer;

    Double engineCapacity;

    public Car(String name, String manufacturer, Double engineCapacity) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.engineCapacity = engineCapacity;
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
