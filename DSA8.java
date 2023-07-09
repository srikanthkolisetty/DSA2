package Ass2;

public class DSA8 {
	
	public static void main(String[] args) {
		
		int nums[]= {1},min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		int k=0;
	      for(int n : nums) {
	          if (min > n) {
	              min = n;
	          }
	          if (max < n) {
	              max = n;
	          }
	      }
	      int diff = max - min;
	      if (diff <= k + k) {
	          System.out.println(0);
	      } else {
	          System.out.println(diff - (k + k));;
	      }
		
	}
	
}
