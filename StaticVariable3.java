public class StaticVariable3 {
    static int a;
    public static void main(String[] args) {
        int b=100;
        //assign value using classname
        StaticVariable3.a=b;
        System.out.println(a);
    }
}
