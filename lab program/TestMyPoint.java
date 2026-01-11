class MyPoint  {
    private int x,y;
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int[] getXY() {
        return new int[] { x, y };
    }
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance(MyPoint another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint();
        System.out.println("Point p1: " + p1.toString());
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Point p2: " + p2);
        p1.setXY(6, 8);
        System.out.println("After setting p1: " + p1);
        int[] coords = p1.getXY();
        System.out.println("p1 coordinates from getXY(): (" + coords[0] + ", " + coords[1] + ")");
        System.out.println("Distance p1 to (0,0): " + p1.distance(0, 0));
        System.out.println("Distance between p1 and p2: " + p1.distance(p2));
        System.out.println("Distance p2 to origin: " + p2.distance());
    }
}
