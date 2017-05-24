package ds.stack;

public class StackTester {

	public static void main(String[] args) {

		Stack stack = new Stack(3);
		
		stack.push(1);
		stack.push(2);
		stack.push(0);
		stack.push(5);
		
		stack.pop();
		
		while(!stack.isEmpty()){
			long value = stack.pop();
			System.out.println(value);
		}
		//System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		System.out.println(stack.isFull());
	}

}
