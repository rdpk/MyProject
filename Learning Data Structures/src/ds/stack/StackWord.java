package ds.stack;

import java.util.Arrays;

public class StackWord {

	private int maxSize;
	private int top;
	private char[] stackArray;
	
	public StackWord(int size){
		this.maxSize = size;
		this.stackArray = new char[maxSize];
		this.top = -1;
	}
	
	public void push(char j){
		top++;
		stackArray[top] = j;
	}

	public  String reverse(String str){
		
		char[] input = str.toCharArray();
		int begin = 0;
		int end = input.length -1;
		char j;
		while(end>begin){
			j = input[begin];
			input[begin] = input[end];
			input[end]= j;
			end--;
			begin++;
		}
		return new String(input);
	}
	@Override
	public String toString() {
		return "StackWord [maxSize=" + maxSize + ", top=" + top + ", stackArray=" + Arrays.toString(stackArray) + "]";
	}
	
}
