class Example7
{
	public static void main(String args[])
	{
		//String
		String str="Code";
		System.out.println(str);
		str.concat("Success");
		System.out.println(str);
		System.out.println("-----------------");
		//StringBuffer
		StringBuffer sb=new StringBuffer("Code");
		System.out.println(sb);
		sb.append("Success");
		System.out.println(sb);

	}
}
//  public java.lang.StringBuffer append(java.lang.String);