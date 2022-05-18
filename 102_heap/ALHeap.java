/**
 * class ALHeap
 * SKELETON
 * Implements a min heap using an ArrayList as underlying container
 */

import java.util.ArrayList;

public class ALHeap
{

  //instance vars
  private ArrayList<Integer> _heap;

  /**
   * default constructor  ---  inits empty heap
   */
  public ALHeap()
  {
    _heap = new ArrayList<Integer>();
  }



  /**
   * toString()  ---  overrides inherited method
   * Returns either
   * a) a level-order traversal of the tree (simple version)
   * b) ASCII representation of the tree (more complicated, more fun)
   */
  public String toString()
  {
    String foo = "[";
    for (int i = 0; i < _heap.size(); i++) {
      foo += _heap.get(i) + ", ";
    }
    foo += "]";
    return foo;
  }//O(n)


  /**
   * boolean isEmpty()
   * Returns true if no meaningful elements in heap, false otherwise
   */
  public boolean isEmpty()
  {
    return (_heap.size() == 0);
  }//O(1)


  /**
   * Integer peekMin()
   * Returns min value in heap
   * Postcondition: Heap remains unchanged.
   */
  public Integer peekMin()
  {
    return _heap.get(0);
  }//O(1)


  /**
   * add(Integer)
   * Inserts an element in the heap
   * Postcondition: Tree exhibits heap property.
   * ALGO:
   * <your clear && concise procedure here>
   */
  public void add( Integer addVal )
  {
    _heap.add(addVal); //adds val to AL

    int p = (_heap.indexOf(addVal) - 1) / 2;
    int rc = 2 * p + 2;
    int lc = 2 * p + 1;

    if (minOf(addVal, rc) == addVal){
      swap(_heap.indexOf(addVal), _heap.indexOf(rc));
    }
    else if (minOf(addVal, lc) == addVal){
      swap(_heap.indexOf(addVal), _heap.indexOf(lc));
    }
  }//O(n)

  public void help( Integer addVal, int rc, int lc){
    if (minOf(addVal, rc) == addVal){
      swap(_heap.indexOf(addVal), _heap.indexOf(rc));
    }
    else if (minOf(addVal, lc) == addVal){
      swap(_heap.indexOf(addVal), _heap.indexOf(lc));
    }
  }


  /**
   * removeMin()  ---  means of removing an element from heap
   * Removes and returns least element in heap.
   * Postcondition: Tree maintains heap property.
   * ALGO:
   * <your clear && concise procedure here>
   */
  public Integer removeMin()
  {
    int removed = _heap.get(0);
    int p = 0;
    int lastValP = _heap.size() - 1;
    for (int i = _heap.size() - 2; _heap.get(i+1) == 0; i--) {
      lastValP = i;
    }

    System.out.println(lastValP);

    swap(0, lastValP);
    _heap.set(lastValP, 0);
    while (minChildPos(p) != -1) {
      if (minChildPos(p) > _heap.get(p)) {break;}
      int newP = minChildPos(p);
      swap(p, newP);
      p = newP;
      //System.out.println("current p: " + p);
    }
    return removed;
  }//O(?)


  /**
   * minChildPos(int)  ---  helper fxn for removeMin()
   * Returns index of least child, or
   * -1 if no children, or if input pos is not in ArrayList
   * Postcondition: Tree unchanged
   */
  private int minChildPos( int pos )
  {
    
    int rc = 2 * pos + 2;
    int lc = 2 * pos + 1;

    if (pos >= _heap.size() || (rc >= _heap.size() && lc >= _heap.size())) {
      return -1;
    }
    else if (rc < _heap.size() && lc >= _heap.size()) {
      return rc;
    }
    else if (lc < _heap.size() && rc >= _heap.size()) {
      return lc;
    }
    else {
      return _heap.indexOf(minOf(_heap.get(rc), _heap.get(lc)));
    }
  }


  //~~~~~~~~~~~~~ aux helper fxns ~~~~~~~~~~~~~~
  private Integer minOf( Integer a, Integer b )
  {
    if ( a.compareTo(b) < 0 )
      return a;
    else
      return b;
  }

  //swap for an ArrayList
  private void swap( int pos1, int pos2 )
  {
    _heap.set( pos1, _heap.set( pos2, _heap.get(pos1) ) );
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  //main method for testing
  public static void main( String[] args )
  {
      ALHeap pile = new ALHeap();

      pile.add(2);
      System.out.println(pile);
      pile.add(4);
      System.out.println(pile);
      pile.add(6);
      System.out.println(pile);
      pile.add(8);
      System.out.println(pile);
      pile.add(10);
      System.out.println(pile);
      pile.add(1);
      System.out.println(pile);
      pile.add(3);
      System.out.println(pile);
      pile.add(5);
      System.out.println(pile);
      pile.add(7);
      System.out.println(pile);
      pile.add(9);
      System.out.println(pile);

      
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      System.out.println("removing " + pile.removeMin() + "...");
      System.out.println(pile);
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class ALHeap
