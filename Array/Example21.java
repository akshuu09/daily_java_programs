class Example21
{
	public static void main(String args[])
	{
		int[][]a={{100,200,300},
			     {400,500,600}};
		for(int i=0;i<a.length; i++)
		{
			for(int j=0; j<a[1].length;j++)
			{
				System.out.println(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}