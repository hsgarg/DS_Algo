package hs.StacksAndQueue;

public class ClientQueue {

	public static void main(String[] args) {
		
		Queue<Integer> runs;
		runs = new LinkedListQueue<>();
		runs.printQueue();
		try {
			runs.enqueue(1);
			runs.enqueue(2);
			runs.printQueue();

			System.out.println("dequeue: " + runs.dequeue());
			System.out.println("dequeue: " + runs.dequeue());
			System.out.println("dequeue: " + runs.dequeue());
			System.out.println("empty: " + runs.isEmpty());

			runs.enqueue(1);
			runs.enqueue(2);
			runs.enqueue(3);
			runs.enqueue(4);
			runs.printQueue();
			runs.enqueue(5);
		
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		System.out.println("--Code--");
		runs.printQueue();
		
		
		
		

	}

}
