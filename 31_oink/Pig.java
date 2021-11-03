/***
Hamim Seam, Nora Miller, Tasnim Chowdhury
APCS
HW31 -- Pig Latin Foundations
2021-11-04
time spent: 0.5 hrs

DISCO:
When manipulating strings, you often want to take care of both uppercase and lowercase values.
Helper methods are godsent for time efficiency.
The "final" keyword can help prevent you from accidentally changing a variable that shouldn't be changed.

QCC:
Is it ideal to use the same test cases for similar methods? Is it a bad practice? Does it depend?
Which is more efficient for the MACHINE, making a variable and using that every time its needed or typing in the value each time?
***/

public class Pig {

	//Q: How does this initialization make your life easier?
	//A: You can check if a letter in a string in lowercase form is in VOWELS, thereby making it a vowel.

	private static final String VOWELS = "aeiou";

  	public static boolean hasA( String w, String letter ) {
		for (int i = 0; i < w.length(); i++) {
			if (w.substring(i, i + 1).toLowerCase().equals(letter.toLowerCase())) {
				return true;
			}
		}
		return false;
  	}

	public static boolean isAVowel( String letter ) {
		return hasA(VOWELS, letter.toLowerCase());
  	}

 	public static int countVowels( String w ) {
		int ctr = 0;
		for (int i = 0; i < w.length(); i++) {
			if (isAVowel(w.substring(i, i + 1))) {
				ctr++;
			}
		}
		return ctr;
  	}

  	public static boolean hasAVowel( String w ) {
		return countVowels(w) > 0;
  	}

	public static String allVowels( String w ) {
		String vows = "";
		String current = "";
		for (int i = 0; i < w.length(); i++) {
			current = w.substring(i, i + 1);
			if (isAVowel(current)) {
				vows += current;
			}
		}
		return vows;
	}


	public static void main( String[] args ) {
		System.out.println("hasA:");
		System.out.println("excel, x: " + hasA("excel", "x"));
		System.out.println("excel, l: " + hasA("excel", "l"));
		System.out.println("paRade, r: " + hasA("paRade", "r"));
		System.out.println("paRade, D: " + hasA("paRade", "D"));
		System.out.println("paRade, j: " + hasA("paRade", "j"));

		System.out.println("\nisAVowel:");
		System.out.println("u: " + isAVowel("u"));
		System.out.println("I: " + isAVowel("I"));
		System.out.println("j: " + isAVowel("j"));

		System.out.println("\ncountVowels:");
		System.out.println("demonstration: " + countVowels("demonstration"));
		System.out.println("phenOmena: " + countVowels("phenOmena"));
		System.out.println("rhythm: " + countVowels("rhythm"));

		System.out.println("\nhasAVowel:");
		System.out.println("demonstration: " + hasAVowel("demonstration"));
		System.out.println("phenOmena: " + hasAVowel("phenOmena"));
		System.out.println("rhythm: " + hasAVowel("rhythm"));

		System.out.println("\nallVowels:");
		System.out.println("demonstration: " + allVowels("demonstration"));
		System.out.println("phenOmena: " + allVowels("phenOmena"));
		System.out.println("rhythm: " + allVowels("rhythm"));
	}

}
