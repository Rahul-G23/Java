abstract class Vehicle {
    String name;
    double distance, time;
    Vehicle(String name, double distance, double time) {
        this.name = name;
        this.distance = distance;
        this.time = time;
    }
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}
class Car extends Vehicle {
    private double acceleration;
    Car(String name, double distance, double time, double acceleration) {
        super(name, distance, time);
        this.acceleration = acceleration;
    }
    double calculateSpeed() {
        return distance / time;
    }
    double calculateVelocity() {
        return calculateSpeed() + (acceleration * time);
    }
}
class Bike extends Vehicle {
    private double gearRatio;
    Bike(String name, double distance, double time, double gearRatio) {
        super(name, distance, time);
        this.gearRatio = gearRatio;
    }
    double calculateSpeed() {
        return distance / time;
    }
    double calculateVelocity() { 
        return calculateSpeed() * gearRatio;
    }
}
public class VehicleProgram {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota Camry", 300, 5, 2.5);
        Vehicle bike = new Bike("Honda CB350", 150, 3, 1.8);
        System.out.println("Car Speed: " + car.calculateSpeed());
        System.out.println("Car Velocity: " + car.calculateVelocity());
        System.out.println("Bike Speed: " + bike.calculateSpeed());
        System.out.println("Bike Velocity: " + bike.calculateVelocity());
    }
}
