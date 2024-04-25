class Example13
{
	public static void main(String args[])
	{
		String str1="cyber";
		String str2="Cyber";
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));

	}
}
//public boolean equalsIgnoreCase(java.lang.String);
//public int compareToIgnoreCase(java.lang.String);