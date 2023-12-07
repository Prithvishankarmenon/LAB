import java.util.Scanner;
class Frequency
 {
	public static void main(String ar[])
	 {
		 int i=0,l,j=0,count=0;
		 String a,b;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter String");
		 a=s.next();
		 l=a.length();
		 System.out.println("Enter alphabet whose frequency has to be checked ");
		 b=s.next();
		 while(i<l)
		  {
			  if(b.charAt(j) == a.charAt(i))
			      {
					 count++;
					 i++;
				  }
			  else
			  {
				  i++;
			  } 
		 }
		 System.out.println("frequency of "+b+" in "+a+" is = "+count);
	 }
 }
		 
