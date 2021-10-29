/**
ThinkCenter of Greatness: Hamim Seam + Vansh ("the ducky"), Diana Akhmedova + Ajax
APCS
HW27: FOR the Love of Strings
2021-10-28
Time Spent: 1.5 hours
DISCO:
- If you have the same value for both parameters of substring() (eg: subsstring(i,i)), it will return an empty String.
- The for loop separates the <init>, <test>, and <UPDT> with semicolons(;), not commas(,).
- If a there is a return statement in a recursive method, it won't necessarily end if the method is called again.
- x.length() returns the length of the String x.
- x.substring(1, 2) returns a new String that is a substring of this String (in this case, only the character in the 1st index will be returned).
- In x.substring(1, 2), "1" is inclusive and "2" is exclusive.
QCC:
- Is there a more formulaic way of thinking of recursion?
- What is the most efficient method: a while loop, a for loop, or a recursive method?
**/

public class Rof {

  public static void main( String[]args ) {
    System.out.println( "Fence FOR loop:");
    System.out.println( fenceF(1) );
    System.out.println( fenceF(2) );
    System.out.println( fenceF(3) );

    System.out.println();
    System.out.println( "Reverse FOR loop:");
    System.out.println( reverseF("stressed") );
    System.out.println( reverseF("dog") );
    System.out.println( reverseF("star") );

    System.out.println();
    System.out.println( "Reverse RECURSION:");
    System.out.println( reverseR("stressed") );
    System.out.println( reverseR("dog") );
    System.out.println( reverseR("star") );
  }

  // fenceF : FOR loop
  public static String fenceF( int posts ) {
    int i;
    String fence = "|";
    for( i = 1; i < posts; i++ ) {
      fence += "--|";
    }
    return fence;
  }

  // reverseF : FOR loop
  public static String reverseF( String s ) {
    int i;
    String reverse = s.substring( s.length() );
    for( i = s.length() - 1; i >= 0; i-- ) {
      reverse += s.substring( i, i + 1 );
    }
    return reverse;
  }

  // reverseR = RECURSION
  public static String reverseR( String s ) {
    int i = s.length();
    if ( i > 1 ) {
      String reverse = s.substring( i - 1 );
      return reverse + reverseR( s.substring( 0, i - 1 ));
    }
    return s;
  }
}
