class Pattern4
{
	public static void main(String args[])
	{

		for(int row=5; row>=1; row--)
		{
			for(int col=5; col<row; col--)
			{
				System.out.println(" ");
			}
				for(int space=1; space<=row; space++ )
				{
					System.out.print("*");
				}
				System.out.println("");
			
			
		}
	}
}

/*
*****
 ****
  ***
   **
    *

*/