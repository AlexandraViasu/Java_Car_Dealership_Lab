package Vehicles;

import Components.Engine;

public class ElectricCar  extends Vehicle{
Engine engine;
    public ElectricCar(int capacity, double price, String color, Engine engine) {
        super(capacity, price, color);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }

    
}
