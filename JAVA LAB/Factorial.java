import java.util.Scanner;
class Factorial
 {
	public static  void  main (String a [])
	 {
		 int fact=1 , i;
		 Scanner s=new Scanner(System.in);
		 System.out.print("Enter the number whose factorial you have to find");
		 int n=s.nextInt();
		 if (n==0) 
		  {			  
		     System.out.print("Factorial=0");
		  }
		 
	     else
	      {
			  for (i=n;i>0;i--)
			   {
				   fact=fact*i;
			   }			
		    System.out.print("Factorial="+fact);   
		  }
	 }
 }	 	 
