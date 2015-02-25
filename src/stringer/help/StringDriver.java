package stringer.help;

import java.util.Scanner;

/**
 * This is the driver class for the Stringhelper
 * this is a simple UI to allow users to test different
 * strings and there new options we have added.
 * @author Garrett J. Beasley
 */
public class StringDriver
{
	/*Variables for the program.*/
	private static final Scanner console = new Scanner(System.in);
		StringHelper helper = new StringHelper();
	
	public static void main(String[] args)
	{
		/*Calling the methods into the main method to be run.*/
		intro();
		
		/*Close the console*/
		console.close();
	}
	
	/**Intro UI for the program
	 * @description This basically is the console ui for the program allowing
	 * the user to select 1-3 and then the program will enter into that mode.
	 *  */
	public static void intro()
	{
		/*User input and selections for the user*/
		System.out.println(" ");
		System.out.println("String Helper System");
		System.out.println("1. Check Vowels");
		System.out.println("2. Check Consonant");
		System.out.println("3. Print Words over 5 characters in length");
		System.out.println("4. Print number of characters in the words");
		System.out.println("5. Check for Palindrome");
		System.out.println("6. Exit");
		System.out.println(" ");
		inputReader();
		
	}
	/**
	 * InputOne (when the user hits 1)
	 * @description When 1 is pressed the program will enter
	 */
	public static void inputOne()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many strings you want to search: ");
		int stringAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*Loop over creating movie objects for the X amount of times
		 * the user specifies in the movieAmount Variable*/
		for(int i=0; i<stringAmount; i++)
		{
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the text to search: ");
			String searchString = console.nextLine(); //clears the prompt (to skip enter key)
			
			StringHelper vowel = new StringHelper();
			System.out.println(vowel.containsVowel(searchString));
		}
		
	}
	
	/**
	 * InputTwo (when the user hits 2)
	 * @description When 2 is pressed the program will enter
	 */
	public static void inputTwo()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many strings you want to search: ");
		int stringAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*Loop over creating movie objects for the X amount of times
		 * the user specifies in the movieAmount Variable*/
		for(int i=0; i<stringAmount; i++)
		{
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the text to search: ");
			String searchString = console.nextLine(); //clears the prompt (to skip enter key)
			
			StringHelper stringer = new StringHelper();
			System.out.println(stringer.containsConsonant(searchString));
		}
	}
	
	/**
	 * InputThree (when the user hits 3)
	 * @description When 3 is pressed the program will enter
	 */
	public static void inputThree()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many strings you want to search: ");
		int stringAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*Loop over creating movie objects for the X amount of times
		 * the user specifies in the movieAmount Variable*/
		for(int i=0; i<stringAmount; i++)
		{
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the text to search: ");
			String searchString = console.nextLine(); //clears the prompt (to skip enter key)
			
			StringHelper stringer = new StringHelper();
			stringer.printLengthWords(searchString, 5);
		}
	}
	
	/**
	 * InputFour (when the user hits 4)
	 * @description When 4 is pressed the program will enter
	 */
	public static void inputFour()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many strings you want to search: ");
		int stringAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*Loop over creating movie objects for the X amount of times
		 * the user specifies in the movieAmount Variable*/
		for(int i=0; i<stringAmount; i++)
		{
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the text to search: ");
			String searchString = console.nextLine(); //clears the prompt (to skip enter key)
			
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter one Char to search for, EX:(e): ");
			String searchChar = console.nextLine(); //clears the prompt (to skip enter key)
			
			StringHelper stringer = new StringHelper();
			int result = stringer.printNumberOfCharacters(searchString, searchChar.charAt(0));
			System.out.println(result);
		}
	}
	
	/**
	 * InputFive (when the user hits 5)
	 * @description When 5 is pressed the program will enter
	 */
	public static void inputFive()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter how many strings you want to search: ");
		int stringAmount = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();
		
		/*Loop over creating movie objects for the X amount of times
		 * the user specifies in the movieAmount Variable*/
		for(int i=0; i<stringAmount; i++)
		{
			/*Tell the user to pick a selection between 1-4*/
			System.out.println("Please enter the text to search: ");
			String searchString = console.nextLine(); //clears the prompt (to skip enter key)
			
			StringHelper stringer = new StringHelper();
			System.out.println(stringer.findPalindrome(searchString));
		}
	}
	
	/**
	 * InputSix (when the user hits 6)
	 * @description When 6 is pressed the program will enter
	 * into the inputSix method and tell the user goodbye
	 * then the system will exit the java machine.
	 */
	public static void inputSix()
	{
		/*Goodbye to the user and thank them*/
		System.out.println("Thanks for testing your strings!");
		
		/*Close the java machine*/
		System.exit(0);
	}

	/**
	 * This will read what the user inputs under the UI
	 * @description: This will read the users input from the UI then
	 * there selected decision will be placed into a variable between 1-3
	 * and compared to the programmed selections 1. Display contacts, 2. Contact info
	 * 3. Exit
	 */
	public static void inputReader()
	{
		/*Tell the user to pick a selection between 1-4*/
		System.out.println("Please enter a selection: ");
		int selection = console.nextInt(); //clears the prompt (to skip enter key)
		console.nextLine();

		/*If user enters 1 enter this section*/
		if(selection == 1)
		{
			/*Go to 1 then loop the code after*/
			inputOne();
			intro();
			inputReader();
		}
		
		/*If user enters 2 enter this section*/
		else if(selection == 2)
		{
			/*Go to 2 then loop the code after*/
			inputTwo();
			intro();
			inputReader();
		}
		
		/*If user enters 3 enter this section*/
		else if(selection == 3)
		{
			/*Go to 3 then loop the code after*/
			inputThree();
			intro();
			inputReader();
		}
		
		/*If user enters 4 enter this section*/
		else if(selection == 4)
		{
			/*Go to 4 then loop the code after*/
			inputFour();
			intro();
			inputReader();
		}
		
		/*If user enters 5 enter this section*/
		else if(selection == 5)
		{
			/*Go to 5 then loop the code after*/
			inputFive();
			intro();
			inputReader();
		}
		
		/*If user enters 6 enter this section*/
		else if(selection == 6)
		{
			/*Go to 6 then loop the code after*/
			inputSix();
		}
		
		/*Anything else other then 1-6 will go down here*/ 
		else
		{
			/*Tell the user to please enter a number between 1-6 and loop the code*/
			System.out.println("Not a valid selection please enter a number between 1-6");
			inputReader();
		}
	}

}
