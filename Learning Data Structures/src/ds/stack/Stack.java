package ds.stack;

public class Stack {

	private int maxSize; //size of stack
	private long[] stackArray; //container to store stack elements
	private int top; //represents index position of last item on top of stack(POINTER)

	//initialize some size to the stack using constructor

	public Stack(int size){
		maxSize = size;
		stackArray = new long[maxSize];
		top = -1; //first item will be at zero index.
	}

	public void push(long j){ //to put things on stack
		if(!isFull()){
			top++; //top = top + 1;
			stackArray[top] = j;

		}else{
			System.out.println("FULL");
		}
	}

	public long pop(){
		if(isEmpty()){
			System.out.println("EMpty");
			return -1;
		}else{
			int old_top = top;
			top--;
			return stackArray[old_top];	
		}
	}

	public long peek(){
		return stackArray[top];
	}

	public boolean isEmpty(){
		if(top == -1){
			return true;
		}else
			return false;
	}

	public boolean isFull(){
		if(top == maxSize -1){
			return true;
		}else{
			return false;
		}
	}
}
