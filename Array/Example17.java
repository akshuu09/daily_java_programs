class Example17
{
	public static void main(String args[])
	{
		Cust[] c=new Cust[5];
		c[0]=new Cust(101, "AA");
		c[1]=new Cust(201, "BB");
		c[2]=new Cust(301, "CC");
		for(Cust cc:c)
		{
			if(cc instanceof Cust)
			{
			System.out.println(cc.custId+"-"+cc.custName);
			}
			else
			{
				System.out.println(cc);
			}
		}
	}
}