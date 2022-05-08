package hs.StacksAndQueue;

import java.util.Arrays;

public class ReverseArrayUsingStack {

	public static <E> void reverseArray(E[] array, int size){
		
		Stack<E>elements = new ArrayStack<>();
		
		for(int i=0; i<size; i++) {
			elements.push(array[i]);
			array[i] = null;
		}
		for(int i = 0; i<size; i++) {
			array[i] = elements.pop();
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] runs = {1,2,3,4,5,6};
		String[] fruits = {"apples", "oranges", "banana", "pineapple"};
		
		System.out.println(Arrays.toString(runs));
		System.out.println("Reversing");
		reverseArray(runs, runs.length);
		System.out.println(Arrays.toString(runs));
		
		System.out.println();
		System.out.println(Arrays.toString(fruits));
		System.out.println("Reversing");
		reverseArray(fruits, fruits.length);
		System.out.println(Arrays.toString(fruits));
		

	}

}
