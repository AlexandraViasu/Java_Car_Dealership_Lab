package People;

import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {
    private String name;
    private double cash;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double cash) {
        this.name = name;
        this.cash = cash;
        this.vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getCash() {
        return cash;
    }

    public int getVehicleCount(){
        return this.vehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }
}
