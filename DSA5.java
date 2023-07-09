package Ass2;

import java.util.Arrays;

public class DSA5 {

	public static void main(String[] args) {
		
		int n[]= {1,2,4,2,5};
		Arrays.sort(n);
		int length=n.length;
		System.out.println(n[length-1]*n[length-2]*n[length-3]);
	}
}
