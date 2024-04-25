class Example16
{
	public static void main(String args[])
	{
		String str="Cyberb";
		System.out.println(str.charAt(2));
        System.out.println(str.contains("ybe"));
		System.out.println(str.contains("xyz"));
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("z"));
		System.out.println(str.lastIndexOf("b"));
		System.out.println(str.lastIndexOf("x"));
	}
}

//public char charAt(int index)
//public boolean contains(CharSequence s)
//public int indexOf(String str)
//public int lastIndexOf(String str)