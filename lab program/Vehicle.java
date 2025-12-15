// Abstract class Vehicle
public abstract class Vehicle {
    
    // Properties
    protected String name;
    protected double distance;
    protected double time;
    
    // Constructor
    public Vehicle(String name, double distance, double time) {
        this.name = name;
        this.distance = distance;
        this.time = time;
    }
    
    // Abstract methods
    public abstract double calculateSpeed();
    public abstract double calculateVelocity();
    
    // Concrete method
    public void displayDetails() {
        System.out.println("Vehicle: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Time: " + time + " hours");
    }
}
