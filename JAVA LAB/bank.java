
interface ban
{
	public void interest();
	
}
class  SBI implements ban
{
	public void interest()
	{
		System.out.print("interest is 6% per annum");
	}
}
class SIB implements ban
{
	public void interest()
	{
		System.out.print("interest is 6.5% per annum");
	}
}	

class bank
{
public static void main(String[] ard)
	{
	SIB s=new SIB();
	SBI s1=new SBI();
	s.interest();
	s1.interest();
	}

}
