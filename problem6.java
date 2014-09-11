import java.util.Arrays;

public class problem6{
	
	public static void main(String[] args){
		//int[] A = {-2,-1, 0,2,3};
		//int[] B = {1,4,6,7, 8,9,11,13};
		int[] A = {-4,-3,-2};
		int[] B = {1,4,6,7};
		
		MySolution sol = new MySolution();
			
		int answer = sol.findMedianSortedArrays(A,B);
			
		System.out.println("Answer "+answer);
	}

}


	
	/*
	public static void main(String[] args) {
		
		int[] sorted_array1 = { 1, 2, 3, 4, 5};
		int[] sorted_array2 = {11,13,19,23,32,48,92,102};
		
		int[] combined = combine(sorted_array1,sorted_array2);
		
		System.out.print(Arrays.toString(combined));
		
	}
	
	//Combines 2 arrays
	public static int[] combine(int[] arr1, int[] arr2){
		
		//Get lengths of both arrays
		int n = arr1.length;
		int m = arr2.length;
		
		//Initialize "combined" array (which will store both arrays)
		int[] combined = new int[n+m];
		
		//Combine arrays using "arraycopy"
		System.arraycopy(arr1, 0, combined, 0, n);
		System.arraycopy(arr2, 0, combined, n, m);
		
		return combined;
	}	
}
	
	*/