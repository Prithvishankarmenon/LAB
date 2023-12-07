import java.util.Scanner;
class Factorial
 {
	public static  void  main (String a [])
	 {
		 int fib=1 , i;
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the number whose factorial you have to find");
		 int n=s.nextInt();
		 if (n==0) 
		  {			  
		     System.out.print("fib=0");
		  }
		 
	     else
	      {
			  for (i=n;i>0;i--)
			   {
				   fib=fib*i;
			   }			
		    System.out.print("fib="+fib);   
		  }
	 }
 }	 	 
