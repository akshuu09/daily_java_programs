class System1{
static System1 Out1;
    void println1(String str)
    {
        System.out.println(str);
    }
}
public class Demo10{
    public static void main(String[] args) {
        System1.Out1=new System1();
        System1.Out1.println1("Cyber Success");
    }
    
}
