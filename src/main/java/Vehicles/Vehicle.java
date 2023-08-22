package Vehicles;


public abstract class Vehicle {
    private int capacity;
    private double price;
    private String color;

    public Vehicle(int capacity, double price, String color) {
        this.capacity = capacity;
        this.price = price;
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }


}
