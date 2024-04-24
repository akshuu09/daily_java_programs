class Example11
{
	public static void main(String args[])
	{
		String str1="cyber";
		String str2="cyber";
		System.out.println(str1.compareTo(str2));
		String str11="cyber";//99
		String str22="amber";//97
		System.out.println(str11.compareTo(str22));
		String str111="amber";//99
		String str222="cyber";//97
		System.out.println(str111.compareTo(str222));
	}
}
//public int compareTo(java.lang.String);