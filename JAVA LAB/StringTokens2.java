import java.io.*;
import java.util.*;
class StringTokens2
{
	public static void main(String ar[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = s.nextLine();
		int n;
		StringTokenizer st = new StringTokenizer(a);
		while(st.hasMoreTokens())
		{
			String v =st.nextToken();
			n=v.length();
			System.out.println(v+" is "+n+" letters long.");
		}
		
	}
}

