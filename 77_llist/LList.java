/***
Team Three Kevins: Kevin Xiao, Kevin Li, Hamim Seam (honorary Kevin)
APCS
HW77 -- Removal
time spent: .6 hours
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 
 DISCO: 
 The crucial trick to implementing add and remove methods are to know how to change the pointers of the nodes so that we
 can insert a new node in between two nodes or completely wipe a node from existence through remove.
 Making temporary variables to store our cargos is very useful!
 QCC:
 Why is this useful to us? Why do we need to know how to add and subtract nodes?
 What is LinkedList? We heard this term from today in class and we are terrified by the connotations associated with this word
 from the intertrash.

 **/
public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _size = 0;
    _head = null;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode temp = new LLNode(newVal, _head);
    _head = temp;
    _size++;

    return true;
  }

  public void add (int index, String newVal) {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    if (index == 0) {
        add(newVal);
        return;
    }

    LLNode before = _head;
    LLNode after;
    LLNode addedNode;

    for (int i = 0; i < index - 1; i++) {
        before = before.getNext();
    }

    after = before.getNext();
    addedNode = new LLNode(newVal, after);

    before.setNext(addedNode);
    _size++;

  }

  //does not work for index 0
  public String remove (int index) {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    String removedNode;
    if (index == 0){
	removedNode = _head.getCargo();
	_head = _head.getNext();
	_size--;
	return removedNode;
    }
    LLNode before = _head;
	  // Initialize temp variable
    LLNode after;
	  // Initialize temp variable
    

    for (int i = 0; i < index - 1; i++) {
        before = before.getNext();
	    //before is one before our target node now
    }

    after = before.getNext();
	  // After is our target number
    removedNode = "[ " + after.getCargo() + " ]";
    after = after.getNext();
	  //after becomes the node after the target

    before.setNext(after);

    _size--;
    return removedNode;
  }

  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode temp = _head;
    for(int i = 0; i < index; i++) {
        temp = temp.getNext();
    }

    return temp.getCargo();
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode temp = _head;
    for (int i = 0; i < index; i++) {
        temp = temp.getNext();
    }
  
    return temp.setCargo(newVal);
  }


  //return number of nodes in list
  public int size()
  {
    return _size;
  }

  //--------------^  List interface methods  ^--------------



  // override inherited toString
  public String toString()
  {
    String output = "[ ";
    LLNode temp = _head;

    for (int i = 0; i < _size; i++) {
        output += temp.getCargo();
        output += " ";
        temp = temp.getNext();
    }

    output += "]";
    return output;
  }


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );

    System.out.println( "removed item: " + james.remove(2));
    System.out.println(james);

    james.add(2, "a");
    System.out.println("added removed item back");
    System.out.println(james);

    james.add(0, "do");
    System.out.println("added item to index 0");
    System.out.println(james);

    System.out.println( "removed item: " + james.remove(0));
    System.out.println(james);
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList
