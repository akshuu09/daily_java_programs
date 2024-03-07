public class ConstructorExample1 {
    // constructor are executed during the obj creation..
    ConstructorExample1()
    {
        System.out.println("Inside Const");
    }
    void m1(){
        System.out.println("Inside m1 method");
    }
    public static void main(String[] args) {
        ConstructorExample1 obj =new ConstructorExample1();
        obj.m1();
    }
}
