import java.util.Scanner;
import java.lang.Math;
class NQUEEN
{
	public static void main(String Art3mis[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Solve(n);
		
	}
	public static void Solve(int n)
	{
		int k=1;
		int a[]=new int[n+1];
		a[k]=0;
		while(k>0)
		{	
			if(a[k]==n)
				a[k]=0;
			else
				a[k]++;
			if(check(a,n,k,a[k])==0)
			{	for(int i=1;i<=n;i++)
				{
					if(check(a,n,k,a[k])==0)
					{
						
						if(a[k]==n)
							a[k]=0;
						else
							a[k]++;

					}
					else if(check(a,n,k,a[k])==1)
					{	
						break;
					}
				}
			}
			if(check(a,n,k,a[k])==1)
			{
				if(k==n)
					break;
				else
				{
					k++;
					a[k]=0;
				}
			}
			else if(check(a,n,k,a[k])==0)
			{
				k=k-1;
			}
			
			
			
		}
		for(int i=1;i<=n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
	public static int check(int a[],int n,int row,int col)
	{
		int check=1;
		for(int i=1;i<row;i++)
		{
			if(a[i]!=0)
			{	if(a[i]==col ||Math.abs(i-a[i])==Math.abs(row-col))
				{	
					check=0;
					break;
				}
			}
		//	System.out.println(i);
		}
	//		System.out.println("check:"+check);
			//System.out.println("row"+row+"col:"+col);

		return check;

	}
}