package stringer.help;

public interface StringInterface
{
	
	public void printLengthWords(String searchString, int splitAmount);
	
	public int printNumberOfCharacters(String searchString, char searchCharacter);
	
	public boolean findPalindrome(String searchString);

	public boolean containsVowel(String searchString);

	public boolean containsConsonant(String searchString);
}
