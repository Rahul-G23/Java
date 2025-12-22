interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int width;
    private int height;
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }
    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }
    public void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}
public class Mainprogram {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.display();
        rect.resizeWidth(30);
        rect.resizeHeight(40);
        rect.display();
    }
}