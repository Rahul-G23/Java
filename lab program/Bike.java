// Bike subclass extends Vehicle
public class Bike extends Vehicle {
    
    private double gearRatio;
    
    // Constructor
    public Bike(String name, double distance, double time, double gearRatio) {
        super(name, distance, time);
        this.gearRatio = gearRatio;
    }
    
    // Implement calculateSpeed() method
    // Speed = Distance / Time
    @Override
    public double calculateSpeed() {
        return distance / time;
    }
    
    // Implement calculateVelocity() method
    // Velocity = Speed * Gear Ratio
    @Override
    public double calculateVelocity() {
        double speed = calculateSpeed();
        return speed * gearRatio;
    }
    
    // Override displayDetails to show bike-specific information
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Bike");
        System.out.println("Gear Ratio: " + gearRatio);
        System.out.println("Speed: " + calculateSpeed() + " km/h");
        System.out.println("Velocity: " + calculateVelocity() + " km/h");
        System.out.println();
    }
}
