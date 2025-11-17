    class A{
    // Method overloading - add two integers
    int add(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method overloading - add three integers
    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    
    // Method overloading - add two doubles
    double add(double num1, double num2) {
        return num1 + num2;
    }
    
    // Method overloading - add using object (call by reference)
    int add(ADD obj) {
        int a = obj.a;
        int b = obj.b;
        return a + b;
    }
}

class demo {
    public static void main(String args[]) {
        // Initialize variables
        int a = 1, b = 2, c = 3;
        double d1 = 1.5, d2 = 1.5;
        
        // Create object of class A
        A obj = new A ();
        
        // Create object of class ADD with values
        ADD NewObj = new ADD(a, b);
        
        // Call by reference - passing object
        int res1 = obj.add(NewObj); // returns 1 + 2 = 3
        
        // Call by value - passing primitive values
        int res2 = obj.add(a, b, c); // returns 1 + 2 + 3 = 6
        double res3 = obj.add(d1, d2); // returns 1.5 + 1.5 = 3.0
        
        // Print results
        System.out.println(res1 + " " + res2 + " " + res3);
        // Output: 3 6 3.0
    }
}

class ADD {
    int a, b;
    
    // Parameterized constructor
    ADD(int a1, int b1) {
        a = a1;
        b = b1;
    }
}

    
    // class A {
    //     int add(int num1, int num2) {
    //         return num1 + num2;
    //     }
        
    //     float add(float num1, float num2) {
    //         return num1 + num2;
    //     }
        
    //     double add(double num1, double num2) {
    //         return num1 + num2;
    //     }
    // }

    // class demo {
    //     public static void main(String args[]) {
    //         A obj = new A();
    //         System.out.println("Sum of integers: " + obj.add(5, 10));
    //         System.out.println("Sum of floats: " + obj.add(5.5f, 10.5f));
    //         System.out.println("Sum of doubles: " + obj.add(5.55, 10.55));
    //     }
    // }