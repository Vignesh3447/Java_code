package Java_code.operations;
public class inter {
    public static void main(String[] args) {
        Audiocall a = new Audiocall();
        a.mute();
        a.call();
    }

    
}
interface whatapplist{
    void mute();
    void call();

}
class Audiocall implements whatapplist{
    
    public void mute()
    {
        System.err.println("audio call mute");

    }
    public void call()
    {
        System.err.println("callling.....");

    }
}