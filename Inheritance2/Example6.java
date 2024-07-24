class A
{
void m1()
	{
	int a=10;
    int b=20;
    int f=a+b;
	System.out.println("Addition is:"+f);
	}
}
class Example6 extends A
{
		public static void main(String args[])
		{
			int c=2;
			int s=3;
			int p=c*s;
			Example6 e6=new Example6();
			e6.m1();
			System.out.println("Multiplication is:"+p);
		}
}