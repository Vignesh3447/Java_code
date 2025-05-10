package Java_code.operations;
interface A {
    void show();
}
interface B extends A {
    void fly();
}
class C implements B {
    public void show() {
        
        int a = 10; // Local variable
        System.out.println("Hello");
    }
    public void fly() {
        System.out.println("Flying");
    }
}
public class interface_extend {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.fly();
    }
}
