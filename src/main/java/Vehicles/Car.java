package Vehicles;

import Components.Engine;

public class Car extends Vehicle{
    Engine engine;
    public Car(int capacity, double price, String color, Engine engine) {
        super(capacity, price, color);
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }


}
