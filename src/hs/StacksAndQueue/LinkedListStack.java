package hs.StacksAndQueue;

import java.util.LinkedList;

public class LinkedListStack<E> implements Stack<E> {
	
	private LinkedList<Integer> list;
	
	public LinkedListStack() {
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
	public E top() {
		if(isEmpty()) {
			return null;
		}
		return (E)list.getLast();
	}

	@Override
	public void push(E e) {
		list.addLast((int)(e));		
	}

	@Override
	public E pop() {
		if(isEmpty()) {
			return null;
		}
		E temp = (E)list.getLast();
		list.removeLast();
		return temp;
	}

	@Override
	public void printStack() {
		System.out.println("isEmpty: " + isEmpty() + " __ " + "Top: " + top() + " __ " + "Size: " + size());	
	}

}
