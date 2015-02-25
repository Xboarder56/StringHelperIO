package stringer.help;

/**
  * StringHelper class where 5 methods are made
  * Methods to check vowels, consonants
  * word length in a group of words,
  * chars showing up in a word
  * and if a word is a palindrome.
  **/
public class StringHelper implements StringInterface
{
	/*
	 * default constructor with no parameters needed
	 * to run the program.
	 */
	public StringHelper()
	{
		/*
		 * Super call so people can see
		 */
		super();
	}

	/**
	  * Check to see if the text the user inputs contains
	  * a lower case or upper case vowel. If it does
	  * return true, otherwise false!
	  **/
	@Override
	public boolean containsVowel(String searchString)
	{
		/*
		 * If it does contain a vowel
		 * return true
		 */
		if(searchString.contains("a") || searchString.contains("e") ||
				searchString.contains("i") || searchString.contains("o") ||
				searchString.contains("u") || searchString.contains("A") ||
				searchString.contains("E") || searchString.contains("I") ||
				searchString.contains("O") || searchString.contains("U"))
		{
			return true;
		}
		
		/*
		 * If it does not contain a vowel
		 * return false
		 */
		else
		{
			return false;
		}
		
	}

	/**
	  * Check to see if the text the user inputs does not contain
	  * a lower case or upper case vowel. If it does not
	  * return true, otherwise false!
	  **/
	@Override
	public boolean containsConsonant(String searchString)
	{
		/*
		 * If it does not contain a vowel
		 * return true
		 */
		if(!(searchString.contains("a") || searchString.contains("e") ||
				searchString.contains("i") || searchString.contains("o") ||
				searchString.contains("u") || searchString.contains("A") ||
				searchString.contains("E") || searchString.contains("I") ||
				searchString.contains("O") || searchString.contains("U")))
		{
			return true;
		}
		
		/*
		 * If it does contain a vowel
		 * return false
		 */
		else
		{
			return false;
		}
	}	

	/*
	 * Check the text the user entered and the splitPoint
	 * (default is 5) and will print any words equal to or
	 * longer than 5 chars in length
	 */
	@Override
	public void printLengthWords(String searchString, int splitAmount)
	{
		/*
		 * Split the string into an array named parts based of the spaces
		 */
		String[] parts = searchString.split(" ");
		
		/*
		 * loops over till the end of the array of parts.
		 */
		for(int i=0; i<parts.length; i++)
		{
			/*
			 * break the parts into part names based on the part[i]
			 * array of words
			 */
			String part = parts[i];
			
			/*
			 * check for part length until we reach the split amount
			 * print when the part length is bigger than the splitAmount
			 */
			if(part.length()>=splitAmount)
			{
				System.out.print(part +" ");
			}
		
		}
		
	}
	/**
	 * Method checks to see how many times a char is detected within
	 * the string.
	 * @return returns result for total amount of times the 
	 * method recurses, if the string does not contain the char
	 * return 0 because we are done.
	 * @param SearchString(text for the user to search)
	 * searchCharacter(char to search for)
	 */
	@Override
	public int printNumberOfCharacters(String searchString, char searchCharacter)
	{
		/*
		 * Checks to see if the string contains the character
		 * if it does not return 0 because we are done here.
		 */
		if(!(searchString.contains(Character.toString(searchCharacter))))
		{
			return 0;
		}
		/*
		 * If its able to be recursively called +1 to the result and return the result.
		 */
		else
		{
			int result = 1 + printNumberOfCharacters(searchString.substring(searchString.indexOf(searchCharacter)+1), searchCharacter);
			return result;
			
		}
		
	}
	
	/**
	 * Method checks to see how many times a char is detected within
	 * the string.
	 * @return returns true if we get to the length of the string
	 * is equal to or less than 1 because we made it to a small enough string
	 * to be a palindrome. return false if the chars do not match each other
	 * 0 and last length-1
	 * @param SearchString(text for the user to search)
	 */
	@Override
	public boolean findPalindrome(String searchString)
	{
		/*
		 * Return true if we have made it 
		 * down to 1 letter or less, that 
		 * means its a match!!!!
		 */
		if(searchString.length()<=1)
		{
			return true;
		}
		
		/*
		 * Return false if its not a match for the string at both ends
		 */
		else if(!(searchString.charAt(0)==searchString.charAt(searchString.length()-1)))
		{
			return false;
		}
		
		/*Have not reached the end of the checking so need to call the 
		 * substring to shorten the string and pass back in to check once again
		 */
		else
		{
			/*
			 * recursive call and shorten the sting to search by by 1 on each end
			 * "eve" => "v" and pass back into the program.
			 */
			return	findPalindrome(searchString.substring(1, searchString.length()-1));
		}
	}

}
