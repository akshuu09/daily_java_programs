class PrintOdd100T010
{
	public static void main(String ags[])
	{
		int num=10;
		System.out.print("list of odd number from 1 to "+num+":");
		for(int i=100; i>=num; i--)
		{
			if(i%2!=0)
			{
				System.out.print(i+ " ");
			}
			
		}
	}
}