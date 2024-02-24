
//Multiclass->nonstaticvariable
class A{
    int a=10;
    void m()
    {
        System.out.println("Inside m method");
    }
}
public class NonStaticVariable {
    public static void main(String[] args) {
        NonStaticVariable obj2 = new  NonStaticVariable();
        obj2.m1();
    }
    void m1(){
        System.out.println("Inside m1 method");
        A obj1 = new A();
        System.out.println(obj1.a);
        obj1.m();

    }
}
