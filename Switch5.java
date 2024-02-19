public class Switch5 
{
    public static void main(String args [])
    {
        int a=2;
        switch (a)
        {
            case 1+1:
            System.out.println("Inside case 1");
            break;
            case 2*1:
            System.out.println("Inside case 2");
            break;
            default:
            System.out.println("Insid default");
        }
    }
    
}
//duplicate case label are not allowed in java
// 1+1=2
//2*1=2