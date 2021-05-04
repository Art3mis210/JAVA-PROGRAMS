import java.util.Scanner;
class OBST
{
	public static void main(String Art3mis[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float a[][]=new float[n+1][n+1];
		a[0][0]=0;
		for(int i=1;i<=n;i++)
		{
				System.out.print("Input Key "+(i)+" : ");
				a[i][i]=s.nextFloat();
		}

		for(int i=1;i<=n-1;i++)
		{
			for(int j=1,k=i+1;k<=n;k++,j++)
			{
				a[j][k]=CalculateCost(a,j,k,n);
			}
		}
/*		for(int j=0;j<n+1;j++)
			System.out.print(j+" ");
		System.out.println();
		System.out.print("**************************************************");
		System.out.println();*/
		System.out.println();
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static float CalculateCost(float a[][],int i,int j,int n)
	{
		float sum=0;
		for(int m=i;m<=j;m++)
			sum+=a[m][m];
		float temp;
		float cost1=a[i][i-1];
		float cost2=a[i+1][j];
		float minimum=cost1+cost2;
		for(int b=i+1;b<=j;b++)
		{
			cost1=a[i][b-1];
			if(b+1<=n)
				cost2=a[b+1][j];
			else 
				cost2=0;
			temp=cost1+cost2;
			if(temp<minimum)
				minimum=temp;
		}
		return minimum+sum;
	}

}