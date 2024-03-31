public class ConstructorExample6 
{
    ConstructorExample6()
    {
        this(100);
        System.out.println("Inside 0 arg const");
    }
    ConstructorExample6(int a)
    {
        System.out.println("Inside 1 arg const");
    }
    ConstructorExample6(int a,float b)
    {
        System.out.println("Inside 2 arg const");
    }
    public static void main(String[] args)
     {
         new ConstructorExample6(200, 300.5f);  
    }
}
