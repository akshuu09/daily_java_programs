public class NamedAndNamelessObjCreation2 {
    int a=100;
    void test()
    {
        System.out.println("Inside test method");
    }
    static NamedAndNamelessObjCreation2 m1()
    {
        System.out.println("Inside m1 method");
        //obj craetion
        return new NamedAndNamelessObjCreation2();
    }
    public static void main(String[] args) {
        //call test
        NamedAndNamelessObjCreation2 ref = m1();
        ref.test();
    }
}
