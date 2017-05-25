package algo.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {

		int[] myArray = search(new int[] {9,8,3,13,87,12,99});
		for(int i=0; i < myArray.length; i++){
			System.out.println(myArray[i]);
		}
	}

	public static int [] search(int[] a){//returns sorted array
		
		System.out.println("Array Length " +a.length);
		
		for(int i=0; i< a.length; i++){
			
			int minimum = i;
			
			
			for(int j=i+1; j< a.length ; j++){
				if (a[j] < a[minimum]){ //Enters here if we find a smaller value
					minimum = j;
				}
			}
			int temp = a[i];
			a[i] = a[minimum];
			a[minimum] = temp;
		}
		return a;	
		
	}
}
