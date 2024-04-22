class String1 extends Object
{
	String str;
	String1(String str)
	{
		this.str=str;
	}
	public String toString()
	{
		return str;
	}
}
class Example4
{
	public static void main(String args[])
	{
		Example4 ref1=new Example4();
		System.out.println(ref1); //toString()-->Object
		String str1=new String("Cyber");
		System.out.println(str1);//toString-->String
		String1 str2=new String1("Success");
		System.out.println(str2.toString());
	}
}