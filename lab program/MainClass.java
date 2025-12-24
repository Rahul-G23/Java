class Outer {
    void display() {
        System.out.println("This is the display method of the Outer class.");
    }
    class Inner {
        void display() {
            System.out.println("This is the display method of the Inner class.");
        }
    }
}
public class MainClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
