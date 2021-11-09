public class Pig{
	private static final String VOWELS = "aeiouAEIOU";

    public static boolean hasA( String w, String letter ) {
        return w.indexOf(letter) != -1;
    }

    public static boolean isAVowel( String letter ) {
        return VOWELS.indexOf( letter ) != -1;
    }

  public static int countVowels( String w ) {
    return allVowels(w).length();
  }

  public static boolean hasAVowel( String w ) {
    // return w.indexOf(w) >= 0;
    return allVowels(w).length() > 0;
  }


  public static String allVowels( String w ) {
    String ans = ""; //init return String
    for(int i = 0; i < w.length(); i++) {
      if ( isAVowel( w.substring(i, i + 1) ) )
        ans += w.substring( i, i + 1 ); //grow the return String
    }
    return ans;
  }


  
  public static String firstVowel( String w ) {
    String ans = "";
    if ( hasAVowel(w) ) //Q: Why this necess?
      ans = allVowels(w).substring(0,1);
    return ans;
  }



  public static boolean beginsWithVowel( String w ) {
    return isAVowel( w.substring(0,1) );
  }


  /**
    String engToPig(String) -- converts an English word to Pig Latin
    pre:  w.length() > 0
    post: engToPig("apple")  --> "appleway"
    engToPig("strong") --> "ongstray"
    engToPig("java")   --> "avajay"
    **/
  public static String engToPig( String w ) {
    String ans = "";
    if ( beginsWithVowel(w) )
      ans = w + "way";
    else {
        if( !firstVowel(w).equals("")){
            int vPos = w.indexOf( firstVowel(w) );
            ans = w.substring(vPos) + w.substring(0,vPos) + "ay";}
        else{ ans = w.substring(w.length() - 1 ) + w.substring(0, w.length() - 1) + "ay"; }
    }

    return ans;
  }
  public static void main(String[] args) {
		
		System.out.println(engToPig("String") );
		System.out.println(engToPig("Pig") );
		System.out.println(engToPig("my") );
		System.out.println(engToPig("psychology") );
		System.out.println(engToPig("yonder") );
		System.out.println(engToPig("i") );
		System.out.println(engToPig("I") );
	}
}
