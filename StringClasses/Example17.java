class Example17
{
	public static void  main(String args[])
	{
		String str="Cyber";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("success".isEmpty());
		System.out.println("".isEmpty());
		System.out.println(str.isEmpty());
		System.out.println(str.startsWith("Cyb"));
		System.out.println(str.startsWith("abc"));
		System.out.println(str.endsWith("er"));
		System.out.println(str.endsWith("xyz"));
	}
}
//public String toUpperCase();
//public String toLowerCase();
//public boolean isEmpty();
//public boolean startsWith(String prefix)
//public boolean endsWith(String suffix)