class Cyber{
    static int a;
}
class Success{
    static float b;
}
public class StaticVariable8 {
    static int a1=10,a2=20;
    public static void main(String[] args) {
        float b1=100.5f,b2=50.5f;
        Cyber.a=a1+a2;
        Success.b=b1+b2;
        System.out.println(Cyber.a);
        System.out.println(Success.b);
    }
}
