package ds.binarysearch;

public class BinarySearch {
	
	public static void main(String[] args) {
		System.out.println(binarySearchList(new int[] {1,2,3,4,5,6,7,8}, 4));
	}

	
	//int a[] = {1,2,3,4,5,6,7,8}; //sorted list
	
	public static int binarySearchList(int []a, int x){
		int p = 0; //first slot of array
		int r = a.length - 1; //Gives last slot of array
		//int q;
	
		while(p<=r){
			int q = (p + r)/2; //Gives the midpoint of P and R.
			
			if (a[q] == x){  // if Midpoint "q" contains the data? return q.
				return q;
				
			}else if( a[q] > x){ // if x is greater than midpoint then bring r to the right of midpoint Q.
				r = q -1;
				
			}else {				//if x is less than midpoint then bring r to the left of midpoint Q.	
				p = q+1;
			}
		}
		return -1; 
	}
}
