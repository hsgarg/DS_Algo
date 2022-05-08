package hs.StacksAndQueue;

public interface Queue<E> {
	
	/*
	 * Returns the current size of the queue
	 * @retun size of queue
	 */
	int size();
	
	/*
	 * Tells if the queue is empty or not
	 * @return true if queue is empty, false otherwise
	 */
	boolean isEmpty();
	
	/*
	 * Returns the element at the front/start of the queue
	 * @return the element at the start of queue, null if queue is empty
	 */
	E front();
	
	/*
	 * Adds element to the last of the queue
	 * @argument e element to be added
	 */
	void enqueue(E e);
	
	/*
	 * Removes element from the front of queue and returns it
	 * @return the element removed from queue/ the element that was at the front of queue before removing
	 */
	E dequeue();
	
	/*
	 * prints the state of queue
	 */
	void printQueue();
}
