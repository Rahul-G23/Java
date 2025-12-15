// Car subclass extends Vehicle
public class Car extends Vehicle {
    
    private double acceleration;
    
    // Constructor
    public Car(String name, double distance, double time, double acceleration) {
        super(name, distance, time);
        this.acceleration = acceleration;
    }
    
    // Implement calculateSpeed() method
    // Speed = Distance / Time
    @Override
    public double calculateSpeed() {
        return distance / time;
    }
    
    // Implement calculateVelocity() method
    // Velocity = Speed + (Acceleration * Time)
    @Override
    public double calculateVelocity() {
        double speed = calculateSpeed();
        return speed + (acceleration * time);
    }
    
    // Override displayDetails to show car-specific information
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Car");
        System.out.println("Acceleration: " + acceleration + " m/s²");
        System.out.println("Speed: " + calculateSpeed() + " km/h");
        System.out.println("Velocity: " + calculateVelocity() + " km/h");
        System.out.println();
    }
}
