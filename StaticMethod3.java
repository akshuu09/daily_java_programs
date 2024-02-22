public class StaticMethod3 {
    static int a=100;
    public static void main(String[] args) {
        System.out.println(a);
        StaticMethod3.m1();
    }
    static void m1(){
        System.out.println("Inside static method m1");
    }
}
