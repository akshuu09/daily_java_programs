public class NestedIfElse2 
{
    public static void main(String args [])
    {
        char gender='f';
        int age=18;
        
        if(age >=21)
        {
            System.out.println("age is matching");
        }
        if(gender=='x' || gender=='y')
        {
            System.out.println("Elligible for marriage");
        }
        else
        {
          System.out.println("gender is not matching");  
        }
    
        
    }
}
