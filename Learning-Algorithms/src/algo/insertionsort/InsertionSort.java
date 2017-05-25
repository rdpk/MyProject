package algo.insertionsort;

import java.lang.reflect.Array;

public class InsertionSort {

	public static void main(String[] args) {

		int[] myArray = sort(new int[] {9,8,3,13,87,12,99});
		for(int i=0; i< myArray.length; i++){
			System.out.println(myArray[i]);
		}
		
	}
	
	public static int[] sort(int[] a){
		
		for(int i = 1; i < a.length; i++){
			
			int element = a[i];
			int j = i - 1;
			
			while(j >= 0 && a[j] > element){
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = element;
		}
		return a;
	}

}
