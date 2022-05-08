package hs.StacksAndQueue;


// 2+3	a op b
// 23+  a b op
// 2+(3*4)
public class PostfixExpEvaluation {

	public static int posfixEvaluator(String exp) {
		
		Stack<Integer>values = new ArrayStack<>();
		String operators = "+-*/";
		for(int i=0; i<exp.length(); i++) {
			char temp = exp.charAt(i);
			
			if(temp - '0' >= 0 && temp-'0'<=9) {
				values.push(temp-'0');
			}
			else {
				int y = values.pop();
				int x = values.pop();
				if(operators.indexOf(temp)==1) {
					values.push(x-y);
				}
				else if(operators.indexOf(temp)==2) {
					values.push(x*y);
				}
				else if(operators.indexOf(temp)==3) {
					values.push(x/y);
				}
				else if(operators.indexOf(temp)==0) {
					values.push(x+y);
				}	
			}
		}
		
		return values.pop();
	}
	
	public static void main(String[] args) {
		String expression = "123+*8+";
		System.out.println(posfixEvaluator(expression));

	}

}
