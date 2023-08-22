package Vehicles;

import Components.Engine;
import Components.FuelTank;

public class Car extends Vehicle{
    Engine engine;
    FuelTank fuelTank;
    public Car(int capacity, double price, String color, Engine engine, FuelTank fuelTank) {
        super(capacity, price, color);
        this.engine = engine;
        this.fuelTank = fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }
    public double getEngineSize(){
        return engine.getSize();
    }
    public double getFuelTankCapacity(){
        return fuelTank.getFuelCapacity();
    }

}
