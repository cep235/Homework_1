import java.util.Arrays;

public class problem3{
	
	public static int fit; //stores the fit (-1,0,+1)
	public static int count; //counter
	public static int bolt_idx; //Stores the index for the current bolt
	public static int sorted_bolts[];
	public static int sorted_nuts[];
	
	public static void main(String[] args) {
		
		int[] Nuts = {2,1,3,5,4};
		int[] Bolts = {5,3,2,1,4};
		
		sort(Nuts, Bolts);
	}
	
	public static int Test(int x, int y){
		if (x == y){
			return 0;
		}
		else if (x > y){
			return 1;
		}
		else{
			return -1;
		}
	}
	
	
	public static void sort(int[] nuts, int[] bolts){
		
		sorted_bolts = new int[bolts.length]; 
		sorted_nuts = new int[nuts.length];
		
		int nut_len = nuts.length;
		int bolt_len = bolts.length;
		
		for (int xx=0; xx < nut_len; xx++){
			for (int yy=0; yy < bolt_len; yy++){
				
				//Compare the 2 variables
				fit = Test(nuts[xx],bolts[yy]);
				
				//If the fit is too small, increment counter
				if (fit == -1){
					count++;
				}
				
				//If the fit is perfect, mark the current bolt index
				if (fit == 0){
					bolt_idx = yy;
				}
			}
			sorted_nuts[nut_len - count - 1] = nuts[xx];
			sorted_bolts[nut_len - count - 1] = bolts[bolt_idx];
			count = 0;
		}
		
		System.out.print("Nuts: "+Arrays.toString(sorted_nuts) + "\n");
		System.out.print("Bolts: "+Arrays.toString(sorted_bolts));
	}
	
}