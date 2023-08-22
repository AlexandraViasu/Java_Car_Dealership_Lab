package people;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> vehicles;
    private String name;
    private double till;

    public Dealership(ArrayList<Vehicle> vehicles, String name, double till) {
        this.vehicles = vehicles;
        this.name = name;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public int vehicleCount(){
        return this.vehicles.size();
    }

    public double getTillBalance() {
        return this.till;
    }
}
