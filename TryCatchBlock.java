class TryCatchBlock
{

	public static void main(String args[])
	{
		try{
			System.out.println("Inside tyr block");
			System.out.println("10/0");
		}
		catch(ArithmeticException ae)
			{
			System.out.println("Inside catch block");
			System.out.println("10/2");
		}
	}
}