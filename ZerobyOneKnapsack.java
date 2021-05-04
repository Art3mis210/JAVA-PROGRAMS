import java.util.Scanner;
import java.lang.Math; 
class ZerobyOneKnapsack
{
	public static void main(String Art3mis[])
	{
		
		int weight=12;
		int a[][]={{12,7,16,20},{4,3,6,2}};
		int n=a[0].length;
		int optimize[][]=new int[n+1][weight+1];
		for(int i=0;i<=n;i++)
		{
				for(int j=0;j<=weight;j++)
				{
					if (i==0 || j==0)
            			optimize[i][j]=0;
            		else if(a[1][i-1]<=j)
						optimize[i][j]=max(optimize[i-1][j],optimize[i-1][j-a[1][i-1]]+a[0][i-1]);
					else
						optimize[i][j]=optimize[i-1][j];
					//System.out.print(optimize[i][j]);
				}
				// System.out.println();
		}																										
		System.out.println(optimize[n][weight]);
		int i=n;
        int j=weight;
 /*       for(i=0;i<=n;i++)
        {
        	for(j=0;j<=weight;j++)
        	{
        		System.out.print(optimize[i][j]+" ");
        	}
        	System.out.println();
        } */
        System.out.println("Items chosen:");
        while(i>0 && j>0)																						
        {
	        if(optimize[i][j]==optimize[i-1][j])
	        {
	            System.out.println("Item "+i+" = 0");
	            i--;
	        }

	        else
	        {
	            System.out.println("Item "+i+" = 1");
	            i--;
	            j=j-a[1][i];

	        }
	    }
		//System.out.println(knapSack(weight,a,n));
		
	}
	public static int max(int a,int b)
	{
		return a>b?a:b;
	}
}