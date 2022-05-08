package hs.StacksAndQueue;

public class LeetcodeCelebrityProblem {
	
	public static int isCelebrity(int[][] array) {
		
		Stack<Integer>celeb = new ArrayStack<>();
		for(int i=0; i<array.length; i++) {
			celeb.push(i);
		}
		
		while(celeb.size() >=2) {
			int x = celeb.pop();
			int y = celeb.pop();

			if(array[x][y] == 1) {
				//means x trusts y: x is not a celeb
				celeb.push(y);
			}
			else {
				celeb.push(x);
			}
		}
		
		int potentialCeleb = celeb.pop();
		
		for(int i=0; i<array.length; i++) {
			if(i != potentialCeleb) {
				if(array[potentialCeleb][i] == 1 || array[i][potentialCeleb] == 0) {
					return -1;
				}
			}
		}
		
		return potentialCeleb;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] trust = { {0, 0, 1, 0},
		           {0, 0, 1, 0},
		           {0, 1, 0, 0},
		           {0, 0, 1, 0} };
		System.out.println(isCelebrity(trust));
	}

}
