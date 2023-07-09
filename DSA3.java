package Ass2;

import java.util.Arrays;

public class DSA3 {
	
	public static void main(String[] args) {
		
		int n[]= {1,3,2,2,5,2,3,7};
		
		
		int length=0;
		for(int i=0;i<n.length;i++)
		{
			int min=n[i];
			int ilength=0;
			for(int j=0;j<n.length;j++)
			{
				
				if(n[j]-min==1 || n[j]-min==0)
				{
						ilength++;
					
				}
			}
			if(length<ilength)
				length=ilength;
		}
		System.out.println(length);
	}

}
