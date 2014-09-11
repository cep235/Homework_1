public class MySolution {
	
    public int findMedianSortedArrays(int A[],int B[]){
    	
    	int median = 0;
    	int n = A.length - 1;
    	int m = B.length - 1;
    	
    	/********************** 
    	 *   FAST SOLUTION    *
    	 **********************/
    	
    	//Consider a case where A & B can be directly concatenated and still remain sorted:
    	// A = {1,2,3};
    	// B = {4,5,6,7};
    	//
    	// Clearly, the median here is B[0]. 
    	//
    	// The following solutions consider the cases where both A&B can be directly
    	// concatenated
    	
    	
    	//If the last element of A is less than the first element of B,
    	if (A[n] < B[0]){
    		if (n == m + 1){
    			return A[n];
    		}
    		else if (m == n + 1){
    			return B[0];
    		}
    	}
    	
    	//If the last element of B is less than the first element of A,
    	if (B[n] < A[0]){
    		if (n == m + 1){
    			return A[0];
    		}
    		else if (m == n + 1){
    			return B[n];
    		}
    	}
    	
    	/*********************** 
    	 *   SLOWER SOLUTION   *
    	 ***********************/
    	
    	

    	return median;
    }
}