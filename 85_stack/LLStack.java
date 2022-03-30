import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {

	LinkedList _stack;
	int _size = 0;

	public LLStack() {
		_stack = new LinkedList<PANCAKE>();
	}

	//Return true if this stack is empty, otherwise false.
    	public boolean isEmpty() {
		return _size == 0;
	}

    	//Return top element of stack without popping it.
    	public PANCAKE peekTop() {
		PANCAKE top = _stack.get(_size-1);
		return top;
	}

    	//Pop and return top element of stack.
    	public PANCAKE pop() {
		_size--;
		return _stack.get(_size);
	}

    	//Push an element onto top of this stack.
    	public void push( PANCAKE x ) {
		_stack.add(x);
		_size++;
	}


}
