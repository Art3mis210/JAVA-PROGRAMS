import java.util.Scanner;
class Sort
{
	static int a[]=new int[10000];
	static void Partition(int a[],int low,int high)
	{
		int mid;
		if(low<high)
		{
			mid=(low+high)/2;
			Partition(a,low,mid);
			Partition(a,mid+1,high);
			mergeSort(a,low,mid,high);
		}
	}
	static void mergeSort(int a[],int low,int mid,int high)
	{
		int i=low;
		int l=low;
		int m=mid+1;
		int temp[]=new int[10];
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
	public static void Bubble(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{   if(a[j]>a[j+1])
				{	int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	static void selection(int a[],int n)
	{ 	int min;
		for(int i=0;i<n;i++)
		{
			min=i;
			for(int j=i+1;j<n;j++)
			{	if(a[j]<a[min])
					min=j;
			}
			if(min!=i)
			{	int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	static void Insertion(int a[],int n)
	{
		for(int i=1;i<n;i++)
		{	
			int key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j]; 
                j=j-1; 
			}
			a[j+1]=key;
		}


	}
	public static void main(String Art3mis[])
	{	Scanner s=new Scanner(System.in);
		System.out.println("Input size of Array:");
		int n=s.nextInt();

		for(int i=0;i<n;i++)
		{
			System.out.println("Input a["+i+"]:");
			a[i]=s.nextInt();
		}
		Boolean exit=false;
		while(!exit)
		{	
			System.out.println("Input 1 for merge Sort:");
			System.out.println("Input 2 for Bubble Sort");
			System.out.println("Input 3 for selection Sort:");
			System.out.println("Input 4 for Insertion sort:");
			System.out.println("Input 5 to display:");
			int choice=s.nextInt();
			if(choice==1)
			{	long startTime = System.nanoTime();
				Partition(a,0,n-1);
				long endTime = System.nanoTime();
				System.out.println("That took " + (endTime - startTime) + " nanoseconds");
			}
			else if(choice==2)
			{	long startTime = System.nanoTime();
				Bubble(a,n);
				long endTime = System.nanoTime();
				System.out.println("That took " + (endTime - startTime) + " nanoseconds");
			}
			else if(choice==3)
			{	long startTime = System.nanoTime();
				selection(a,n);
				long endTime = System.nanoTime();
				System.out.println("That took " + (endTime - startTime) + " nanoseconds");

			}
			else if(choice==4)
			{	long startTime = System.nanoTime();
				Insertion(a,n);
				long endTime = System.nanoTime();
				System.out.println("That took " + (endTime - startTime) + " nanoseconds");
			}
			else if(choice==5)
			{
				for(int i=0;i<n;i++)
				{
					System.out.println("a["+i+"]:="+a[i]);
				}
			}
		}
	}

}


