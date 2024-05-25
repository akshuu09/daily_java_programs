interface HdfcBankAccount
{
	void bankAccount();
}
interface HdfcLoans extends HdfcBankAccount
{
	void bankLoans();
}
class Customer1 implements HdfcBankAccount
{
	public void bankAccount()
	{
		System.out.println("Open Saving Account");
	}
}
class Customer2 implements HdfcLoans
{
	public void bankAccount()
	{
		System.out.println("Open Current Account");
	}
	public void bankLoans()
	{
		System.out.println("Apply for business loan");
	}
}
class Example4
{
	public static void main(String args[])
	{
		HdfcBankAccount cust1=new Customer1();
		cust1.bankAccount();

		System.out.println("_________________________________");
        HdfcLoans cust2=new Customer2();
		cust2.bankAccount();
		cust2.bankLoans();
	}
}