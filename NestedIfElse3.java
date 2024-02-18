public class NestedIfElse3 
{
    public static void main(String args [])
    {
        char gender='f';
        int age=18;
        if(gender=='f' || gender=='m')
        {
            System.out.println("elligible for marriage");
        if(age>=18)
        {
            System.out.println("age is matching");
        }
        else{
            System.out.println("gender is not matching");
        }
    }
        else 
        {
           System.out.println("age is not matching"); 
        }
    

    }
}
