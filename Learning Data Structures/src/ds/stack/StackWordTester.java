package ds.stack;

public class StackWordTester {

	public static void main(String[] args) {

		StackWord stackword = new StackWord(5);
		
		stackword.push('h');
		stackword.push('e');
		stackword.push('l');
		stackword.push('l');
		stackword.push('o');
		
		System.out.println(stackword);
		
		System.out.println(stackword.reverse("hello"));
		}
	}


