public class NestedIfElse1 
{
    public static void main(String args [])
    {
        char gender='m';
        int age=21;
        if(gender=='m' && age>=21)
        {
            System.out.println("Elligible for vote");
        if(gender=='f' && age<=8)
        {
            System.out.println("NOt Elligible for vote");
        }

        else
        {
            System.out.println("invalid");
        }
        if(gender=='m' && age<=19)
        {
            System.out.println("Not elligible for vote");
        }
        else{
            System.out.println("may or may not be");
        }
    }


        }
    }

