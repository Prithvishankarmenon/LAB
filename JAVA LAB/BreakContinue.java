public class BreakContinue {

	public static void main(String[] args) {

		String [] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		System.out.println("Test Break statement in While loop");
		System.out.println("\nWorking Days:\n");
		int i = 0;
		while (i < weekdays.length ) {
		if (weekdays[i].equals("Saturday") ||  weekdays[i].equals("Sunday")) {
				i++;
				break;
				// Not any working day will be printed
				// because the loop breaks on Sunday
				// once the loop breaks it moves out of the loop
			}
			System.out.println(weekdays[i++]);
		}

		System.out.println("\nTest Continue statement in While loop");
		System.out.println("\nWorking Days:\n");

		int j = 0;
		while (j < weekdays.length ) {
		if (weekdays[j].equals("Saturday") ||  weekdays[j].equals("Sunday")) {

				j++;
				continue;
				// All the working/business days will be printed
				// when the loop encounters Saturday or Sunday
				// it skips that iteration and continues to the next iteration
			}
			System.out.println(weekdays[j++]);
		}

		// A test case for continue statement using for loop
		System.out.println("\nTest Continue in For loop");
		for (int x = 0; x < 5; x++) {
			if (x == 2)
				continue;
			System.out.println(x);
		}
	}
}
