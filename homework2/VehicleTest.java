package homework2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class VehicleTest {
    @Test
    public void carIsInstanceOfVehicle() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void carHas4Wheels() {
        Car car = new Car("Toyota", "Camry", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void motorcycleHas2Wheels() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void carReachesSpeed60InTestDrive() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void motorcycleReachesSpeed75InTestDrive() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void carStopsInParkingMode() {
        Car car = new Car("Toyota", "Camry", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void motorcycleStopsInParkingMode() {
        Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}