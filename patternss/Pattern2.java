/*
    *
   * *
  * * *
 * * * *
* * * * *
*/
class Pattern2
{
	public static void main(String args[])
	{
		for(int space=1; space<4; space++)
		{
			for(int row=1;row<=5; row++)
			{
				for(int col=1; col<row; col++)
				{
					System.out.print("*");
				}
					System.out.println("");
			}
		}
	}
}