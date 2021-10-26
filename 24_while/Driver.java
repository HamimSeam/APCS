/*
Team Lenovo Bozos (Hamim Seam, Vansh Saboo)
APCS
HW24 -- Get It While You Can (While Loops...)
2021-10-25
time spent: ~0.5 hours

DISCO:
Using \n in a print statement makes a line break.
Number of matches seems to stay constant with the same y value.
Number of heads changes but stays slightly above the x value.

QCC:
It makes sense for the number of matches to be constant, since the loop will terminate at an exact value each time
(the closest multiple of 5 over 65536 and y).
It also makes sense for the number of heads to vary, since that is reliant on Math.random(),
so there'll be a different output each time.
How would changing the bias affect the number of heads?

POST-v0 MODS:
For assignValue there was initially a return statement after every if block;
Vansh noted that it'd be more concise to have a single return line at the end, since they all returned the instance variable value.

*/


public class Driver {

  public static void main( String[] args ) {

    //build Objects from blueprint specified by class Coin

    //test default constructor

      Coin mine = new Coin();
      //test 1st overloaded constructor
      Coin yours = new Coin( "quarter" );
      //test 2nd overloaded constructor
      Coin wayne = new Coin( "dollar", "heads" );
      //test toString() methods of each Coin
      System.out.println("mine: " + mine);
      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test flip() method
      System.out.println("\nAfter flipping...");
      yours.flip();
      wayne.flip();

      System.out.println("yours: " + yours);
      System.out.println("wayne: " + wayne);

      //test equals() method
      if ( yours.equals(wayne) ) {
        System.out.println( "Matchee matchee!" );
      }
      else {
        System.out.println( "No match. Firestarter you can not be." );
      }
      /*===================TOP==========================
      ====================BOTTOM======================*/

      Coin flipA = new Coin();
      Coin flipB = new Coin();
      int x = 762384; //number of heads
      int y = 77627; //number of matches
      int matchCtr = 0;
      int totHeadCtr = 0;
      while (totHeadCtr < x || matchCtr < y || matchCtr < 65536 || matchCtr % 2005 != 0) {
        flipA.flip();
        flipB.flip();
        totHeadCtr = flipA.getHeadsCtr() + flipB.getHeadsCtr();
        if (flipA.equals(flipB)) {
          matchCtr++;
        }
      }

      System.out.println("\nPair flip test...");
      System.out.println("Number of heads: " + totHeadCtr);
      System.out.println("Number of matches: " + matchCtr);

  }//end main()

}//end class
