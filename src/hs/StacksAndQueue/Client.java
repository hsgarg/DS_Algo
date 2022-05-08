package hs.StacksAndQueue;

public class Client {

	public static void main(String[] args) {
		Stack<Integer> runs;
		runs = new LinkedListStack<>();
		try {
		runs.printStack();
		
		runs.push(1);
		runs.push(2);
		runs.printStack();
		System.out.println("Popping: " + runs.pop());
		System.out.println("Popping: " + runs.pop());
		System.out.println("Popping: " + runs.pop());
		runs.printStack();
		
		runs.push(1);
		runs.push(2);
		runs.push(3);
		runs.push(4);
		runs.push(5);
		runs.printStack();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		System.out.println("Print here");
		
	}

}
