import Components.FuelTank;
import Components.Engine;
import org.junit.Before;
import org.junit.Test;
import Vehicles.Car;

import static org.junit.Assert.assertEquals;

public class CarTest{

    Car car;
    Engine engine;
    FuelTank fuelTank;

    @Before
    public void before(){
        fuelTank = new FuelTank(50);
        engine = new Engine(1.8);
        car = new Car(5, 10000, "Ruby", engine, fuelTank);
    }


    @Test
    public void getCapacity(){
        assertEquals(5, car.getCapacity());
    }

    @Test
    public void getColour(){
        assertEquals("Ruby", car.getColor());
    }

    @Test
    public void getEngineSize(){
        assertEquals(1.8, car.getEngineSize(), 0.01);
    }

    @Test
    public void canGetFuelTankCapacity() {
        assertEquals(50, car.getFuelTankCapacity(), 0.01);
    }

}