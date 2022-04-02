public class NodeQueue<QUASAR> implements Queue<QUASAR>
{

  LLNode<QUASAR> _head;
  int _size;

  public NodeQueue(QUASAR firstCar)
  {
    LLNode<QUASAR> first = new LLNode<QUASAR>(firstCar, null);
    _head = first;
    _size = 0;
  }

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue()
  {
    _head = _head.getNext();
    _size--;
    return _head.getCargo();
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x )
  {
    LLNode tmp = _head;
    while (tmp.getNext() != null) {
      tmp = tmp.getNext();
    }

    tmp.setNext(new LLNode(x, null));
    _size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty()
  {
    return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront()
  {
    return _head.getCargo();
  }


  public static void main(String[] args) {
    NodeQueue<Object> cart = new NodeQueue<Object>("bananas");
    cart.enqueue(5);
    cart.enqueue(true);
    cart.enqueue("potatoes");

    while (cart.isEmpty() == false) {
      System.out.println(cart.peekFront());
      System.out.println(cart.dequeue());
    }

  }

  public class LLNode<QUASAR> {
  //instance vars
  private QUASAR _cargo;
  private LLNode<QUASAR> _nextNode;

  // constructor
  public LLNode( QUASAR value, LLNode<QUASAR> next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public QUASAR getCargo()
  {
    return _cargo;
  }

  public LLNode<QUASAR> getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public QUASAR setCargo( QUASAR newCargo )
  {
    QUASAR foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode<QUASAR> setNext( LLNode<QUASAR> newNext )
  {
    LLNode<QUASAR> foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toQUASAR
  public String toString()
  {
    return _cargo.toString();
  }

  }

}
