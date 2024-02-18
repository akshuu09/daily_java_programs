public class IncDec1 
{
    public static void main(String agrs[])
    {
        int i=1;

        System.out.println(i); //1

        System.out.println(++i); // 1+i=2
        //the ++i operator the way it work is it will first increment the value of i and then print i value.

        System.out.println(i); // now i become =2

        System.out.println(i++); //i+2
        // as seen  above the i++ operator will first print the value of 'i' and only then
        // at the end it will perform increment operation.

        System.out.println(i); //3

    }
}
