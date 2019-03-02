package car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageTest {

    @Test
    void shouldGetVehiclesCount() {

        Garage garage = new Garage();

        garage.park(new Vehicle()).park(new Car()).park(new Bike());

        assertEquals(3, garage.getVehiclerInGarageCount());

    }
}