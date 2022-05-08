package hs.StacksAndQueue;

// O(1) Time Complexity for all the functions: except print
// O(capacity) capacity>size of stack
public class ArrayStack<E> implements Stack<E> {
	
	public static final int capacity = 1000; 		//default capacity of array
	public E[] data;								// holds the data
	int p = -1;										//position of top of stack in array
	
	public ArrayStack() {
		this(capacity);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int cap) {
		data = (E[])new Object[cap];
	}
	
	@Override
	public int size() {
		return p+1;
	}

	@Override
	public boolean isEmpty() {
		return p == -1;
	}

	@Override
	public E top() {
		if(size()==0) {			//stack is empty
			return null;
		}
		return data[p];
	}

	@Override
	public void push(E e) {
		if(p+1 == data.length) {	//stack is full
			throw new IllegalStateException();
		}
		data[++p] = e;
	}

	@Override
	public E pop() {
		if(size()==0) {
			return null;
		}
		E tempData = data[p];
		data[p--] = null; 			//helps in garbage collection
		return tempData;
	}

	@Override
	public void printStack() {
		System.out.println("isEmpty: " + isEmpty() + " __ " + "Top: " + top() + " __ " + "Size: " + size());
	}

}
