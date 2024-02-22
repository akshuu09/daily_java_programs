class Cyber1{
    static int a1=10;
}
class Success1{
    static float b1=100.5f;
}
class Institute{
    static int x1;
    static float y1;
}
public class StaticVar {
    static int a2=100;
    public static void main(String[] args) {
        float b2=20.5f;
        Institute.x1=Cyber1.a1+a2;
        Institute.y1=Success1.b1+b2;
        System.out.println(Institute.x1);
        System.out.println(Institute.y1);
    }
}
