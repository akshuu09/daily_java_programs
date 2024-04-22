class Example3
{
	public String toString()
	{
		return "Inside Example3";
	}
	public static void main(String args[])
	{
		 Example3 ref=new  Example3();
		 System.out.println(ref); // implicit call to toString 
		 System.out.println(ref.toString()); // explicit call to toString
		

	}
}