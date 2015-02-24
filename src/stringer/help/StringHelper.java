package stringer.help;

public class StringHelper implements StringInterface
{
	int counter =0;
	
	public StringHelper()
	{
		super();
	}

	@Override
	public boolean containsVowel(String searchString)
	{
		if(searchString.contains("a") || searchString.contains("e") ||
				searchString.contains("i") || searchString.contains("o") ||
				searchString.contains("u") || searchString.contains("A") ||
				searchString.contains("E") || searchString.contains("I") ||
				searchString.contains("O") || searchString.contains("U"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

	@Override
	public boolean containsConsonant(String searchString)
	{
		if(!(searchString.contains("a") || searchString.contains("e") ||
				searchString.contains("i") || searchString.contains("o") ||
				searchString.contains("u") || searchString.contains("A") ||
				searchString.contains("E") || searchString.contains("I") ||
				searchString.contains("O") || searchString.contains("U")))
		{
			return true;
		}
		else
		{
			return false;
		}
	}	

	@Override
	public void printLengthWords(String searchString)
	{
		String[] parts = searchString.split(" ");
		
		for(int i=0; i<parts.length; i++)
		{
		String part = parts[i];
		if(part.length()>=5)
		{
			System.out.print(part +" ");
		}
		
		}
		
	}

	@Override
	public int printNumberOfCharacters(String searchString, char searchCharacter)
	{
		
		if(counter==searchString.length())
		{
			return 0;
		}
		else
		{
			counter++;
			printNumberOfCharacters(searchString, searchCharacter);
			return searchString.indexOf(searchString, searchCharacter);
		}
		
	}

	@Override
	public boolean findPalindrome(String searchString)
	{
		if()
		{
			
		}
		else
		{
			
		}
	}

}
