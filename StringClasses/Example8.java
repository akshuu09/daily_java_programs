class Example8
{
	public static void main(String args[])
	{
		String str1="Artificial";
		String str2="Intellegence";
		String str3="Artificial";
		System.out.println(str1.equals(str2));//String-->equals-->Content
		System.out.println(str2.equals(str3));//String-->equals-->Content
		System.out.println(str3.equals(str1));//String-->equals-->Content
		System.out.println("-------");
		
      StringBuffer sb1=new StringBuffer("Artificial");
	  StringBuffer sb2=new StringBuffer("Intellegence");
	  StringBuffer sb3=new StringBuffer("Artificial");
		System.out.println(sb1.equals(sb2));//Object-->equals-->reference
		System.out.println(sb2.equals(sb3));//Object-->equals-->reference
		System.out.println(sb3.equals(sb1));//Object-->equals-->reference
	}
}
// public int compareTo(java.lang.Object);
//== --->reference comparison
//equals--->content comparison