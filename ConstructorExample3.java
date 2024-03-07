public class ConstructorExample3 {
    ConstructorExample3(int a)
    {
        System.out.println("Inside Const 1 arg"+a);
    }
     void m2()
    {
        System.out.println("Inside m2 method");
    }
    public static void main(String[] args) {
        ConstructorExample3 obj2 = new ConstructorExample3(100);
        obj2.m2();
    }

}
