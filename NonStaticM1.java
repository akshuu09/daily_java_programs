public class NonStaticM1 {
    public static void main(String[] args) {
        int a=100;
        NonStaticM1 obj2 = new NonStaticM1();
        int result= obj2.test(a);
        System.out.println("The result is " +result+" ");

    }
    int test (int a)
    {
        int result = a + 200;
        return result;
    }
}
