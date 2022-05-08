package hs.Dequeue;

public interface Dequeue<E> {
	
	/*
	 * Tells the size of the queue
	 * @return size of queue 
	 */
	public int size();
	
	/*
	 * Tells if a queue is empty or not
	 * @return true if queue is empty, false otherwise
	 */
	public boolean isEmpty();
	
	/*
	 * Gives the first element of the queue
	 * @return element at front, null if queue is empty
	 */
	public E getFirst();
	
	/*
	 * Gives the last element of the queue
	 * @return last element inserted into the queue, null if queue is empty
	 */
	public E getLast();
	
	/*
	 * Inserts element at the start of the queue
	 * @argument e element to be inserted
	 */
	public void insertAtFront(E e);
	
	/*
	 * Inserts element at the end of the queue
	 * @argument e element to be inserted
	 */
	public void insertAtEnd(E e);
	
	/*
	 * Deletes element at front of queue
	 * @return the deleted element, null if the queue was empty
	 */
	public E deleteFromFront();
	
	/*
	 * Deletes element at end of queue
	 * @return the deleted element, null if the queue was empty
	 */
	public E deleteFromEnd();
	
	public void printQueue();
	
}
