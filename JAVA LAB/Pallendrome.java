import java.util.Scanner;
class Pallendrome
 {
	public static void main(String ar[])
	 {
		 int i=0,l , flag=0;
		 String a;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter String");
		 a=s.next();
		 l=a.length();
		 int l1=l;
		 while(i<l1)
		  {
			  if(a.charAt(i)!= a.charAt(l-1))
			      {
					  flag=1;
				  }
			   i++;
			   l--;
		 }
		 if(flag==1)
		 {
			System.out.println("nnnot  pall"); 
		 }
		 else
		 {
			 System.out.print("pall");
		 }
	  }
	  
}
