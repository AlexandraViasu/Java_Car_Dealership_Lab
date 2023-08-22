import Components.Engine;
import Components.FuelTank;
import Vehicles.Vehicle;
import org.junit.Before;
import org.junit.Test;
import People.Customer;
import People.Dealership;
import Vehicles.Car;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealerShipTest {
    Dealership dealership;
    Customer customer;
    Car car;
    Engine engine;
    FuelTank fuelTank;


    @Before
    public void before(){
        dealership = new Dealership("Vehicles", "Bob", 1000000);
        customer = new Customer("Sheila", 50000.00);
        fuelTank = new FuelTank(100);
        engine = new Engine(1.8);
        car = new Car(5, 10000, "Green", engine, fuelTank);

    }
    @Test
    public void canGetDealerName(){
        assertEquals("Bob", dealership.getName());
    }

    @Test
    public void canGetDealerMoney(){
        assertEquals(50000.00, dealership.getTillBalance(), 0.01);
    }
    
}
