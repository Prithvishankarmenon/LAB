import java.io.*;
import java.util.*;
class StringTokens1
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		String a = s.nextLine();
		int n;
		StringTokenizer st = new StringTokenizer(a);
		while(st.hasMoreTokens())
		{
			String v =st.nextToken();
			n=Integer.parseInt(v);
			if(n%2==0)
			{
			    System.out.println(n+" is Even.");
		    }
		    else
		    {
				System.out.println(n+" is Odd.");
			}
		}
		
	}
}

