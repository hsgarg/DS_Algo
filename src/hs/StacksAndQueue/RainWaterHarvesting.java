package hs.StacksAndQueue;

public class RainWaterHarvesting {
	
	public static int rainWaterHarvesting(int[] height) {
		Stack<Integer>water = new ArrayStack<>();
		int quantity = 0;
		for(int i=0; i<height.length; i++) {
			System.out.println("-------------iteraation  " +  i);
			while(!water.isEmpty() && height[i]>height[water.top()]) {
				System.out.println("Inside While");
				int currentIndex = water.pop();
				System.out.println("Current Index: " + currentIndex);
				if(water.isEmpty()) {
					break;
				}
				int distance = i - water.top() - 1; //distance between surrounding boundaries of currentIndex
				int length = Math.min(height[i], height[water.top()]) - height[currentIndex];
				System.out.println("distance: " +distance);
				System.out.println("length: " + length);
				quantity += distance*length;
			}
			water.push(i);
			System.out.println("Below push" );
			System.out.println("----------------");
		}
		return quantity;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,0,2};
		System.out.println(rainWaterHarvesting(height));

	}

}
