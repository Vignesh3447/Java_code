package Java_code.operations;
interface A {
    void show();
}
interface B {
    void fly();
}
class C implements A, B {
    public void show() {
        System.out.println("Hello");
    }
    public void fly() {
        System.out.println("Flying");
    }
}
public class ingiretance {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.fly();
    }
}
