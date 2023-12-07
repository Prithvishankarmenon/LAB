import java.util.Scanner;

class complex
{
	int real,img,ar,ai;
	
	complex()
	{}
	
	complex(int a,int b)
	{
		this.real = a;
		this.img = b;
	}
	
	complex add(complex c1,complex c2 )
	{
		complex c3 =new complex();
		c3.ar=c1.real+c2.real;
		c3.ai=c1.img+c2.img;
		
		return c3;
	}


}
class PassObject2
{
	public static void main(String args[])
	{
    	Scanner s=new Scanner(System.in);
	 	System.out.println("first real");
	 	int a1 = s.nextInt();
	 	System.out.println("first img");
	 	int a2 = s.nextInt();
	 	System.out.println("second real");
	 	int a3 = s.nextInt();
	 	System.out.println("second img");
	 	int a4 = s.nextInt();
		complex c1 =new complex(a1,a2);
		complex c2 =new complex(a3,a4);
		complex c3 =new complex();
		c3=c3.add(c1,c2);
		
		System.out.println(c3.ar+"+"+c3.ai+"i");
		
		
	}
}
