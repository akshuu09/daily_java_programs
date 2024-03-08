class HDFC
{
    int amountbalance;
    HDFC(int amountbalance)
    {
        System.out.println("Processing Your Account Details.....!");
        if(amountbalance>=5000)
    {
        this.amountbalance=this.amountbalance+amountbalance;
        System.out.println("Your Account is Successfully created...!");
    }
    else
    {
        System.out.println("Please Deposit valid amount...!");
    }
    }
    void getAmountBalance()
    {
        System.out.println("Your Amount Balance is " +amountbalance);
    }
}
public class App {
    public static void main(String[] args) 
    {
        HDFC cust1=new HDFC(10000);
        cust1.getAmountBalance();
        System.out.println("----------------");
        HDFC cust2=new HDFC(4000);
        cust2.getAmountBalance();
    }
    
}
