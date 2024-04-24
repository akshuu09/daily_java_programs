class Example10
{
	public static void main(String args[])
	{
		//StringBuffer to String
		StringBuffer sb1=new StringBuffer("Technical");
	    // approach 1--->constructor
		String str=new String(sb1);
		System.out.println(str);

		//approach 2--->toString()
		StringBuffer sb2=new StringBuffer("Traning");
		String str2=sb2.toString();
		System.out.println(str2);


	}
}