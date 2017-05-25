package algo.recurssion;

public class App {

	public static void main(String[] args) {
		reduceByOne(10);
		
		System.out.println(recLinearSearch(new int[] {1,2,3,4,5,6,7,8}, 0, 3));
		
		System.out.println(recBinarySearch(new int[] {1,2,3,4,5,6,7,8}, 0, 7, 99));//p = starting index, r = last index , x to search
	}

	public static void reduceByOne(int n){	//Backtracing: Numbers were waiting for others to finish

		if(n>= 0){
			reduceByOne(n - 1);
		}
		System.out.println("Completed Call: " +n);
	}

	public static int recLinearSearch(int[] a, int i, int x){ //i is index, x to search

		int n = a.length - 1;

			if (a[i] == x){
				return i;
			}
			else if(i>n){
				return -1;
			}else{
				System.out.println("index at "+i);
				return recLinearSearch(a, i+1, x);
			}
	}
	
	public static int recBinarySearch(int[] a, int p, int r, int x){
		
		System.out.println("[ " +p +"..." +r +" ]");
		if(p > r){
			return -1;
		}else{
			int q = (p + r)/2;
			
			if(a[q] == x){
				return q;
			}else if(a[q] > x){
				return recBinarySearch(a, p, q - 1, x);
			}else{
				return recBinarySearch(a, q + 1, r, x);
			}
		}
	}

}
