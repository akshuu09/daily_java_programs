interface AmazonServices
{
	void fashion();
	void beauty();
	void home();
}
abstract class AmazonFashion implements AmazonServices
{
	public void fashion()
	{
		System.out.println("Get ready for the unlimited fun zone...");
	}
}
abstract class AmazonBeauty extends AmazonFashion
{
	public void beauty()
	{
	   System.out.println("Fast-track happiness Order today & get it by tomorrow..");
	}
}
class AmazonHome extends AmazonBeauty
{
	public void home()
	{
		System.out.println("Decorate your homne....");
	}
}
class AmazonServices1
{
	public static void main(String args[])
	{
		AmazonHome allProduct=new AmazonHome();
		allProduct.fashion();
		allProduct.beauty();
		allProduct.home();

	}
}