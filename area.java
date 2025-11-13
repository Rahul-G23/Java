public class area {
    float length, breadth, radius;
    area( float base, float height, float radius)
    {
        this.radius = radius;
        this.length = base;
        this.breadth = height;
    }
    float areaTriangle()
    {
        return (0.5f * length * breadth);
    }
    float areaCircle()
    {
        return (3.14f * radius * radius);
    }
    public static void main(String[] args) {
        area A = new area(10,5,3);
        float res=A.areaCircle();
        float res2=A.areaTriangle();
        System.out.println("The area of the circle is: " + res);
        System.out.println("The area of the triangle is: " + res2);
    }
}