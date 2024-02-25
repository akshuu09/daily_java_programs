
public class StaticVariableInNonStaticArea 
{
    static int a=20;
    static void m1()
    {
        System.out.println("Inside m1 method");
    }
    public static void main(String[] args) {
        StaticVariableInNonStaticArea obj1 = new StaticVariableInNonStaticArea();
        obj1.m2();
    }
    void m2(){
    System.out.println(a);
    m1();
    }
    
}
