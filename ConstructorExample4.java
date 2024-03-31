public class ConstructorExample4 {
    int a;
    ConstructorExample4()
    {
        System.out.println("Inside 0 arg " + a);
        a=10;
    }
    public static void main(String[] args) {
        ConstructorExample4 ce=new ConstructorExample4();
        System.out.println(ce.a);
    }
}
