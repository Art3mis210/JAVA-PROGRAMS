import java.lang.Math;
class MergeSort
{	
	static int a[]=new int[10000];
	static void Merge(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			Merge(a,low,mid);
			Merge(a,mid+1,high);
			mergeSort(a,low,mid,high);
		}
	}
	static void mergeSort(int a[],int low,int mid,int high)
	{
		int i=low;
		int l=low;
		int m=mid+1;
		int temp[]=new int[10000];
		while(l<=mid && m<=high)
		{
			if(a[l]<=a[m])
			{
				temp[i]=a[l];
				l++;
			}
			else
			{
				temp[i]=a[m];
				m++;
			}
			i++;
		}
		while(l<=mid)
		{
			temp[i]=a[l];
			l++;
			i++;
			
		}
		while(m<=high)
		{
			temp[i]=a[m];
			m++;
			i++;
		} 
		for(int k=low;k<=high;k++)
		{
			a[k]=temp[k];
		}   
	}
	static int Random(int min,int max)
	{
        int range = max - min + 1; 
        int rand = (int)(Math.random() * range) + min;
        return rand;
	}
	public static void main(String Art3mis[])
	{	
		for(int i=0;i<10000;i++)
		{
			int n=Random(0,100000);
			a[i]=n;
		}
		long startTime1 = System.currentTimeMillis();
		Merge(a,0,9999);
		long endTime1 = System.currentTimeMillis();
		System.out.println("That took " + (endTime1 - startTime1)+ " milliseconds");
		long startTime2 = System.currentTimeMillis();
		Merge(a,0,9999);
		long endTime2 = System.currentTimeMillis();
		System.out.println("That took " + (endTime2 - startTime2)+ " milliseconds");;
	}


}