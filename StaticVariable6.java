class Demo{
    static char a='s';
}
public class StaticVariable6 {
    public static void main(String[] args) {
        //direct access is not valid
    //System.out.println(a);
    System.out.println(Demo.a);
    }
    
}

