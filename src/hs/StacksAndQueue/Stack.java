package hs.StacksAndQueue;

public interface Stack <E>{
	
	/*
	 * Tells the current size of the stack
	 * @return size of stack
	 */
	int size();
	
	/*
	 * Tells weather the stack is empty or not
	 * @return true if stack is empty, false otherwise
	 */
	boolean isEmpty();
	
	/*
	 * Returns the top most element of the stack without changing the stack
	 * @return the top element of the stack, null if stack is empty
	 */
	E top();
	
	/*
	 * Pushes the element to the top of the stack
	 * @argument e element to be added to the stack
	 */
	void push(E e);
	
	/*
	 * Removes the topmost element from the stack and returns it
	 * @return the removed element or the topmost element of the stack before removing, null if stack is empty
	 */
	E pop();
	
	/*
	 * Prints the state of the stack
	 */
	void printStack();
	
}
