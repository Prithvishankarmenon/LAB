public class BreakContinue {

	public static void main(String[] args) {

		String [] weekdays = { "Friday", "Saturday" ,"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
		System.out.println("Test Break statement in While loop");
		System.out.println("\nWorking Days:\n");
		int i = 0;
		while (i < weekdays.length )
		 {
		   if (weekdays[i].equals("Saturday") ||  weekdays[i].equals("Sunday")) 
		    {
				i++;
				break;
				
			}
			System.out.println(weekdays[i++]);
		 }

		System.out.println("\nTest Continue statement in While loop");
		System.out.println("\nWorking Days:\n");

		int j = 0;
		while (j < weekdays.length ) 
		{
		  if (weekdays[j].equals("Saturday") ||  weekdays[j].equals("Sunday")) 
		    {

				j++;
				continue;
		
			}
			System.out.println(weekdays[j++]);
		}

		
	}	
	
}
