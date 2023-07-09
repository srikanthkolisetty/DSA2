package Ass2;

import java.util.Arrays;

public class DSA2 {

	public static void main(String[] args) {
		
		int n[]= {1,4,2,3,2,1,6,7};
		int eat=n.length/2;
		Arrays.sort(n);
		int dis=0,prev=0;
		for(int i=0;i<n.length;i++)
		{
			if(i==0)
			{
				prev=n[i];
				dis=1;
			}
			if(n[i]!=prev)
			{
				dis+=1;
				prev=n[i];
			}
		}
		System.out.println("total available unique candies "+dis);
	}
}
