class Code{
    static int a1=10,a2=20;
}
class Coder{
    static float b1=10.5f,b2=20.5f;
}
public class StaticVariableAdd {
    static int a;
    public static void main(String[] args) {
        float b;
        a=Code.a1+Code.a2;
        b=Coder.b1+Coder.b2;
        System.out.println(a);
        System.out.println(b);
    }
}
