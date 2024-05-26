interface Sample1
{
    final int a = 10;
    default void display()
    {
        System.out.println("Default method....");
    }
}


class Example6 implements Sample1
{
    
    public static void main (String[] args)
    {
       Example6 e1  = new Example6();
        e1.display();
    }
}