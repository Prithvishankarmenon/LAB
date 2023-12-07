import java.util.Scanner;
class Fib1
 {
	public static  void  main (String ar [])
	 {
		 int fib=0 ,sum=1, prev=0,a=0,i;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the number digits in series");
		 int n=s.nextInt();
		 if (n==0) 
		  {			  
		     System.out.print("fib=0");
		  }
		 
	     else
	     {
		   System.out.print(fib +" ");
		   System.out.print(fib+1 +" "); 
		   
		    while(n>a)
				{
					a=prev+sum;
			    	while(n>a)
				        {
					      System.out.print(a+" " );
				          prev=sum;
				          sum=a;
				        }    
			   } 
				
			
		 }
	}
}		 	
