public class StaticMethod1 {
    public static void main(String[] args) {
        method2();
        StaticMethod1.method2();
       
    }
    static void method(){
        System.out.println("Inside method2");
        return;
    }
    static void method2(){
        System.out.println("Inside method");
        return;
    }
}
