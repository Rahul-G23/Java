class Shape {
    private static final double PI = 3.14159;
    
    // Method to calculate area (can be overridden)
    public static double calculateArea(String shapeType, double... dimensions) {
        switch(shapeType.toLowerCase()) {
            case "square":
                return squareArea(dimensions[0]);
            case "triangle":
                return triangleArea(dimensions[0], dimensions[1]);
            case "circle":
                return circleArea(dimensions[0]);
            default:
                return 0;
        }
    }
    
    // Static method to calculate square area
    private static double squareArea(double side) {
        return side * side;
    }
    
    // Static method to calculate triangle area
    private static double triangleArea(double base, double height) {
        return (base * height) / 2;
    }
    
    // Static method to calculate circle area
    private static double circleArea(double radius) {
        return PI * radius * radius;
    }
}

public class assignment {
    public static void main(String[] args) {
        // Calculate areas
        System.out.println("Area of Square (side=5): " + Shape.calculateArea("square", 5));
        System.out.println("Area of Triangle (base=10, height=8): " + Shape.calculateArea("triangle", 10, 8));
        System.out.println("Area of Circle (radius=7): " + Shape.calculateArea("circle", 7));
    }
}
