// use of this keyword
public class Demo5 {
    int a=100;
    void m1(int a)
    {
        System.out.println("Inside  m1 Method");
        System.out.println(a);
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        Demo5 obj1 = new Demo5();
        obj1.m1(10);
    }
}
