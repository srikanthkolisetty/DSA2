package Ass2;

public class DSA4 {
	
	public static void main(String[] args) {
		
		int n[]= {1,0,0,0,1},t=1;
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i]==0 && t>0)
			{
				if(i==0 && n[i+1]==0)
				{
					n[i]=1;
					t-=1;
				}
				
				if(n[i-1]==0 && n[i+1]==0)
				{
					n[i]=1;
					t-=1;
				}
				
				if(i==n.length-1 && n[i-1]==0)
				{
					n[i]=1;
					t-=1;
				}
			}
		}
		System.out.println(t==0?true:false);
	}

}
