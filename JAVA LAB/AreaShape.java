import java.io.*;
import java.util.Scanner;
class AreaShape
{int sh,l,b,g;
	  float r,base,h;
	
	public static void main (String [] args) 
  {
	  int sh,l,b;
	  float r,base,h;
	  Scanner s=new Scanner(System.in);
	  AreaShape z= new AreaShape(); 
	  System.out.println("Enter the shape whoose area has to be found");
	  System.out.println("1. CIRCLE			2. RECTANGLE		3. TRIANGLE");
	  sh=s.nextInt();
	  if (sh==1)
	    {
		    System.out.println("Enter radius of the cicle");
			r=s.nextFloat();	  
			z.Area(r);
		}
	  else if (sh==2)
	    {
		  	System.out.println("Enter length of the rectangle");
			l=s.nextInt();	
			System.out.println("Enter breadth of the rectangle");
			b=s.nextInt();
			z.Area(l,b);
	    }
	  else if (sh==3)
	  {
		  System.out.println("Enter base of the triangle");
		  base=s.nextInt();
		  System.out.println("Enter height of the triangle");
		  h=s.nextInt();
		  z.Area(base,h);
	  }  
 } 
	void Area(float i)
	{
		 r=i;
		 double ar =3.14*r*r;
		 System.out.println("Area of circle is"+ar);
	}
	void Area(int g,int h)
	{  
		l=g;
		b=h;
		int ar =l*b;
		System.out.println("Area of rectangle is"+ar);
	}
	void Area (float i,float j)
	{  
		base=i;
		h=j;
		double ar =0.5*h*base;
		System.out.println("Area of triangle is"+ar);
	}	
	
  }


