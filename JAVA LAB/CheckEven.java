import evenpackage.*;
class CheckEven
{
	public static void main (String ar[])
	{
		int b;
		Even e = new Even();
		b=e.check(3);
		if(b==0)
		{
			System.out.print("Even");
		}
		else
		{
			System.out.print("not even");
		}
    }
}
