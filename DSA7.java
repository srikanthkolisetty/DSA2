package Ass2;

public class DSA7 {

	public static void main(String[] args) {
		
		int n[]= {1,2,2,3};
		boolean inc=true,dec=true;
		for(int i=0;i<n.length-1;i++)
		{
			if(n[i]>n[i+1])
				inc=false;
				
			if(n[i]<n[i+1])
				dec=false;
		}
		
		System.out.println(inc||dec);
	}
}
