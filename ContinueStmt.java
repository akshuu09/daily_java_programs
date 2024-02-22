public class ContinueStmt 
{
    public static void main(String args [])
    {
        for(int i=1; i<=5; i++)
        {
            if(i==3)
            {
                System.out.println("The value of i " +i);
                continue;
            }
            System.out.println(i);

        }
    }
}  

