class Example16
{
	public static void main(String args[])
	{
		String str=null;
		if(str instanceof String)
		{
			System.out.println("Str is holding the data of String");
		}
		else
		{
			System.out.println("Str is not holding the data of String");
		}
	}
}