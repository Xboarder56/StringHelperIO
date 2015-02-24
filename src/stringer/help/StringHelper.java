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
	//int totalCharactersFound =0;
	@Override
	public int printNumberOfCharacters(String searchString, char searchCharacter)
	{
		if(!(searchString.contains(Character.toString(searchCharacter))))
		{
			return 0;
		}
		else
		{
			int result = 1 + printNumberOfCharacters(searchString.substring(searchString.indexOf(searchCharacter)+1), searchCharacter);
			return result;
			
		}
		
	}

	@Override
	public boolean findPalindrome(String searchString)
	{
	return true;
	}

}
