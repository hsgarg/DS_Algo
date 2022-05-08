package hs.Dequeue;

public class ArrayDequeue<E> implements Dequeue<E> {
	
	public static final int capacity = 1000;
	int p =-1;
	E[] data;
	int sz =0;
	
	ArrayDequeue() {
		this(capacity);
	}
	
	ArrayDequeue(int cap){
		data = (E[])new Object[cap];
	}
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return sz;
	}

	@Override
	public boolean isEmpty() {
		return sz==0;
	}

	@Override
	public E getFirst() {
		if(sz == 0) {
			return null;
		}
		return data[p];
	}

	@Override
	public E getLast() {
		if(sz==0) {
			return null;
		}
		return data[(p+sz-1)%data.length];
	}

	@Override
	public void insertAtFront(E e) {
		if(sz == data.length) {
			throw new IllegalStateException("Dequeue is full!");
		}
		data[(p-1 + data.length)%data.length] = e;
		sz++;
		p = (p-1 + data.length)%data.length;
	}

	@Override
	public void insertAtEnd(E e) {
		if(sz == data.length) {
			throw new IllegalStateException("Dequeue is full!");
		}
		data[(p+sz)%data.length] = e;
		sz++;
	}

	@Override
	public E deleteFromFront() {
		if(sz==0) {
			return null;
		}
		E temp = data[p];
		data[p] = null;
		p = (p + 1)%data.length;
		sz--;
		return temp;
	}

	@Override
	public E deleteFromEnd() {
		if(sz==0) {
			return null;
		}
		E temp = data[(p+sz)%data.length];
		data[(p+sz)%data.length] = null;
		sz--;
		return temp;
	}

	@Override
	public void printQueue() {
		for(int i = p; i< p+sz; i++) {
			System.out.print(data[i%data.length] + " ");
		}
		System.out.println();
	}
	

}
