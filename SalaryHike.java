import java.util.Scanner;
class SalaryHike
{
   public static void main(String args[])
   {
       Scanner as=new Scanner(System.in);

      System.out.print("Enter your salary : ");
       double salary = as.nextDouble();

      System.out.print("Enter your score : ");
       int score = as.nextInt();

      System.out.println("Previous salary was : " +salary+ "rs");

        if(score>=0 && score<=100)
         { 
           if(salary>=90)
            {
              salary += ((salary/100)*3);
            }
           else
            {
              salary +=((salary/100));
            }
         }
       else
        {
          System.out.println("Wrong Score Entered");
        }
          System.out.println("Your revised salary for " + score + " score is " +salary+ "rs");
   }
}