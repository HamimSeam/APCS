import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {

	ArrayList<PANCAKE> _stack;
	int _size;

	public ALStack()
	{
  		_stack = new ArrayList<PANCAKE>();
		_size = 0;
	}

	public void push( PANCAKE x )
  	{
    		_stack.add(x);
		_size++;
  	}// O(1) amortized


  	//means of removal
  	public PANCAKE pop()
  	{
		_size--;
    		return _stack.get(_size);
  	}// O(1)

  	public PANCAKE peekTop()
	{
    		return _stack.get(_size-1);
  	}

	//chk for emptiness
	public boolean isEmpty()
  	{
    		return _size == 0;
  	}// O(1)

}
