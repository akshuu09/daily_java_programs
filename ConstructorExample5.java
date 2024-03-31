public class ConstructorExample5 {
    ConstructorExample5()
    {
        this(100);
        System.out.println("Inside 0 arg const");
    }
    ConstructorExample5(int a)
    {
        System.out.println("Inside 1 arg const");
    }
    public static void main(String[] args) {
        ConstructorExample5 obj=new  ConstructorExample5();
    }
}
