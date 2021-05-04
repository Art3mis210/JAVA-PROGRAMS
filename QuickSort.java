import java.lang.Math;
class QSort
{	
	static int a[]=new int[10];
	static void QuickSort(int a[],int beg,int end)
	{
		 int loc;  
        if(beg<end)  
        {  
            loc = partition(a, beg, end);  
            quickSort(a, beg, loc-1);  
            quickSort(a, loc+1, end);  
        }
 
	}
	static void Partition(int a[],int low,int high)
	{
		int left, right, temp, loc, flag;     
        loc=left=beg;  
        right=end;  
        flag=0;  
        while(flag!=1)  
        {  
            while((a[loc]<=a[right]) && (loc!=right))  
            right--;  
            if(loc==right)  
            flag =1;  
            else if(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                left++;  
                if(loc==left)  
                flag =1;  
                else if(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
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
		for(int i=0;i<10;i++)
		{
			int n=Random(0,100);
			int c=0;
			while(c==0)
			{	for(int j=0;j<10;j++)
				{
					if(n==a[j])
						c=1;
				}
				if(c=0)
				{	a[i]=n;
					break;
				}
			}
		}
		long startTime1 = System.currentTimeMillis();
		QuickSort(a,0,9);
		long endTime1 = System.currentTimeMillis();
		System.out.println("That took " + (endTime1 - startTime1)+ " milliseconds");
		//long startTime2 = System.currentTimeMillis();
		//Partition(a,0,9999);
		//long endTime2 = System.currentTimeMillis();
		//System.out.println("That took " + (endTime2 - startTime2)+ " milliseconds");;
	}


}