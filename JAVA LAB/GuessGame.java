import java.security.SecureRandom;
import java.util.Scanner;

class GuessGame
{
    public static void main( String args[] ) 
    {
		int limit,i=0,j=1,guess;
       Scanner s=new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        // Setting the upper bound to generate 
        // the random numbers between the specific range
        System.out.println("ENTER THE RANGE FROM 0");
        limit = s.nextInt();
        int upperbound = limit;
        int random1 = rand.nextInt(upperbound);
        while(i==0)
        {
			 System.out.println("ENTER GUESS NO "+j);
			 guess = s.nextInt();
			   if (random1 == guess)
			   {
			     System.out.println("CORRECT GUESS");
			     break;
			   }
			   else if (random1 < guess)
			   { 
			       System.out.println("ENTER A LOWER NUMBER");
			       j++;
			   }
			   else 
			   {
				   System.out.println("ENTER A HIGHER NUMBER");
				   j++;
			   }
		}
        
       
     }
 }

