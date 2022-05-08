package hs.Dequeue;

public class Client {

	public static void main(String[] args) {
		Dequeue<Integer> runs;
		
		runs = new ArrayDequeue<>();
		
		runs.printQueue();
		
		runs.insertAtFront(1);
		runs.insertAtFront(2);
		runs.insertAtEnd(3);
		runs.printQueue();
		
		System.out.println("first: " + runs.getFirst());
		System.out.println("Last: " + runs.getLast());
		
		runs.deleteFromEnd();
		runs.printQueue();
		
		runs.deleteFromFront();
		runs.printQueue();
		
		

	}

}
