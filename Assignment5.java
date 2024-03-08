public class Assignment5 
{
    Assignment5()
    {
        System.out.println("Inside Const 0 arg");

    }
    static void m1()
    {
        System.out.println("Inside m1 method");

    }
    void m2()
    {
        System.out.println("Inside m2 method");

    }
    public static void main(String[] args)
     {
        Assignment5 obj=new Assignment5();
        obj.m2();
        m1();

    }
}
