
public class keyboard {
	public static void main(String[] args)
	  

	{ int consonantLetters = keyboard.countConsonant(5, 26);
	    
	System.out.print(consonantLetters);
	  }
	  
	  

	public static int countConsonant (int vowels, int alphabet);
	{
	 int consonant = alphabet - vowels;
	      

	return consonant;
	    }
}

