/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Object> cakes = new ALStack<Object>();
    //Stack<Z> cakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    cakes.push("leo");
    cakes.push(85);
    cakes.push(true);

    while (!cakes.isEmpty()) {
        System.out.println(cakes.peekTop());
	System.out.println(cakes.pop());
    }


    //...

  }//end main

}//end class
