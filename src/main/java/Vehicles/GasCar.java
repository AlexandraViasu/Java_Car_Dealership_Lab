package Vehicles;

import Components.Engine;
import Components.FuelTank;

public class GasCar extends Vehicle {
    Engine engine;
    FuelTank fuelTank;

    public GasCar(int capacity, double price, String color, Engine engine, FuelTank fuelTank) {
        super(capacity, price, color);
        this.engine = engine;
        this.fuelTank =fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public double getFuelCapacity() {
        return fuelTank.getFuelCapacity();
    }
}
