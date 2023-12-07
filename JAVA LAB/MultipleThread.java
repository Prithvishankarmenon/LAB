import java.util.Scanner;
class calc extends Thread
{      
    int z1;
	int y1;
	int x1;
		
      calc(int z, int y, int x)
	{
		 z1=z;
		 y1=y;
		 x1=x;
	}
	public void run()
	{
		if (x1==1)
		{
			int r = z1+y1;
			System.out.println("Sum is "+r);
		}
		else
		{
			int r=z1-y1;
			System.out.println("Difference is  is "+r);
		}
	}
}
class MultipleThread
{
	public static void main(String ar[])
	{
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a=s.nextInt();
		b=s.nextInt();
		int m=1;
		int n=2;
		calc cl = new calc(a,b,m);
		calc cl1 = new calc(a,b,n);
		cl.setName("Addition");
		cl1.setName("Subtraction");
		cl.start();
		cl1.start();
	}
}
