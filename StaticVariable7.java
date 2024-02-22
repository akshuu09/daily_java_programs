class Demo3{
    static char a='A';
}
class Demo4{
    static boolean b=true;
}

public class StaticVariable7 {
    static char aa;
    public static void main(String[] args) {
        boolean bb;
        aa=Demo3.a;
        bb=Demo4.b;
        System.out.println(aa);
        System.out.println(bb);
    }
}
