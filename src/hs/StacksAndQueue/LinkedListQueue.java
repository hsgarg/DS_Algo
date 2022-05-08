package hs.StacksAndQueue;

import java.util.LinkedList;

public class LinkedListQueue<E> implements Queue<E> {
	
	private LinkedList<Integer>list;
	
	public LinkedListQueue(){
		list = new LinkedList<>();
	}
	
	@Override
	public int size() {
		return list.size();
	}

	@Override
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public E front() {
		if(isEmpty()) {
			return null;
		}
		return (E)list.getFirst();
	}

	@Override
	public void enqueue(E e) {
		list.addLast((int)e);
	}

	@Override
	public E dequeue() {
		if(isEmpty()) {
			return null;
		}
		return (E)list.removeFirst();
	}

	@Override
	public void printQueue() {
		System.out.println("IsEmpty: " +isEmpty() + " __ " + "size: " + size() + " __ " + "front: " + front());
		
	}

}
