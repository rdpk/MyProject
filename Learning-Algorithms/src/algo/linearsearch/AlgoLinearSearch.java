package algo.linearsearch;

public class AlgoLinearSearch {

	int a[] = {1,2,3,4,5}; //array
	//int x; //value to search
	
	public int search(int x){

		System.out.println("Array length " +a.length);

		for(int i=0; i<a.length; i++){
			if(a[i] == x){
				//Way to print Return type	
				//System.out.println(i);
				return i; //Return Ends the method when Solution is reached.
			}
			
		}
		return -1;
	}

	//just to understand return method
	public static int add(int a, int b){
		return a + b;
		
	}
}




