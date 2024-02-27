public class NamedAndNamelessObjCreation {
    int a=100;
    static void m1(NamedAndNamelessObjCreation obj)
    {
        System.out.println("Inside m1 method");
        System.out.println(obj.a);
    }
    public static void main(String[] args) {
        //named obj creation
        NamedAndNamelessObjCreation obj = new NamedAndNamelessObjCreation();
        m1(obj);

        //nameless obj creation
        m1(new NamedAndNamelessObjCreation());
    }
}
