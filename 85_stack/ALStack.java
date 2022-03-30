import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {


public ALStack(int initCapacity) {
  ArrayList<PANCAKE> _stack = new ArrayList(initCapacity);
  _stackSize = 0;
}

  public void push( PANCAKE s )
  {
    if (isFull()){
        String[] temp = new String[_stackSize  *2];
        for (int i = 0; i < _stackSize; i++){
            temp[i] = _stack[i];
        }
        _stack = temp;
    }
    _stack,set(_stackSize, s);
    _stackSize++;
  }// O(1) amortized


  //means of removal
  public String pop( )
  {
    if (isEmpty()){
        return "null";
    }
     String temp = _stack[_stackSize-1];
    _stackSize--;
      return temp;
  }// O(1)

  public PANCAKE peekTop(){
    return _stack.get(size-1);
  }

  //chk for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == 0);
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize == _stack.length;
  }// O(1)
}

}
