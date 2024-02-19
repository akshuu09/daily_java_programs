//Write a java program to swap the values between two variables bu using a temp variable 

public class Swap1 
{
    public static void main(String args[])
    {
        int a=10;
        int b=20;
        int temp;
        System.out.println("before swap a is "+a);
        System.out.println("before swap b is "+b);
         temp=a;
         a=b;
         b=temp;
         System.out.println("After swap a is "+a);
         System.out.println("After swap b is "+b);

    }
}
