package hs.StacksAndQueue;

public class ArrayQueue<E> implements Queue<E> {
	
	public static final int capacity = 1000;		//default capacity
	int p = 0;										//tells the front of the queue in array
	E[] data;										//array containing data 
	int sz = 0;										//size of the queue
	
	ArrayQueue(){
		this(capacity);
	}
	public ArrayQueue(int cap) {
		data = (E[])new Object[cap];
	}
	
	@Override
	public int size() {
		return sz;
	}

	@Override
	public boolean isEmpty() {
		return sz==0;
	}

	@Override
	public E front() {
		if(isEmpty()) {
			return null;
		}
		return data[p];
	}

	@Override
	public void enqueue(E e) {					//added to the end
		if(sz == data.length) {
			throw new IllegalStateException("Queue is Full");
		}
		int available = (p + sz)%data.length;
		data[available] = e;
		sz++;
			
	}

	@Override
	public E dequeue() {					//deleted from the front
		if(isEmpty()) {
			return null;
		}
		E temp = data[p];
		data[p] = null;
		sz--;
		p = (p+1)%data.length;
		return temp;	
	}
	@Override
	public void printQueue() {
		for(int i=p; i<p+sz; i++) {
			System.out.print(data[i%data.length] + " ");
		}
		System.out.println();
		
	}

}
