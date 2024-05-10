interface HdfcServices
	{
		void banking();
		void insurance();
		void finance();
	}
abstract class HdfcBanking implements HdfcServices
	{
		public void banking()
		{
			System.out.println("Banking implementation");
		}
	}
abstract class HdfcInsurance extends HdfcBanking
	{
		public void insurance()
		{
			System.out.println("Insurance implementation");
		}
	}
abstract class HdfcFinance extends HdfcInsurance
	{
		public void banking()
		{
			System.out.println("Finance implementation");
		}
	}
class Example3 {
	public static void main(String args[])
	{
	   HdfcFinance cust1=new HdfcFinance();
		cust1.banking();
		cust1.insurance();
		cust1.finance();
	}
}

