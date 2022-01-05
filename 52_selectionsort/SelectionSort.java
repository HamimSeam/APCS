// Silly Snakes - Neil Lin, Vansh Saboo, Hamim Seam
// HW52: Selection, Natch
// 2021-1-4
// time spent: 0.5 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO: Find the greatest value and set it at the end of the arraylist. After every pass, decrement the max position so that the next greatest value will be put right before
 * the previous greatest value. (last, 2nd last, 3rd last, etc.)
 *
 * DISCO-
 *
 * QCC-
 * q0: How many passes to sort n elements?
 * a0: n passes
 * q1: What do you know after pass p?
 * a1: the last p elements are sorted.
 * q2: How do you know if sorted?
 * a2: You have iterated through the entire list and ensured ascending order for each one 
 * q3: What does a pass boil down to?
 * a3: Finding the next greatest value and swapping it with the element at the p-th index from the right (when you're on your p-th iteration).
 ******************************/


import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = 0;

    for(int pass = data.size(); pass > 0; pass--) {
      System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
