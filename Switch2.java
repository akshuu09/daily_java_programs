public class Switch2 
{
    public static void main(String args [])
    {
        char signal='r';
        switch(signal)
        {
            case 'r':
            System.out.println("Inside red");
            break;
            case 'g':
            System.out.println("Inside green");
            break;
            case 'y':
            System.out.println("Inside yellow");
            break;
            default:
            System.out.println("Invalid signal");

        }
    }
    
}
