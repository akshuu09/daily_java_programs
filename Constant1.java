public class Constant1
 {
    public static void main(String args[])
    {
        int a=2;
        final int X=1, Y=2, Z=3;
        switch(a)
        {
            case X:
            System.out.println("Inside case-1-x");
            break;
            case Y:
            System.out.println("Inside case-2-y");
            break;
            case Z:
            System.out.println("Inside case-3-z");
            break;
            default:
            System.out.println("Inside default");
        }
    }
    
}
