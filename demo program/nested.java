class A{
    static  class B{
        void test(){
            System.out.println("This is a nested class example.");
        }
    }
}
public class nested {
    public static void main(String[] args) {
        A objA=new A();
        A.B objB = new A.B();
        objB.test();
    }
    
}
