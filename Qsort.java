import java.lang.Math;
class Qsort
{	
	static int a[]=new int[1000];
	static int count;
	static void QuickSort(int a[],int beg,int end,int order)
	{
		int loc;  
        if(beg<end)  
        {  
            loc = Partition(a, beg, end,order);
            QuickSort(a, beg, loc-1,order);  
            QuickSort(a, loc+1, end,order);    
        }
        count++; 
 
	}
	static int Partition(int a[],int beg,int end,int order)
	{
		int left, right, temp, loc, flag;     
        loc=left=beg;  
        right=end;  
        flag=0; 
        if(order==0) 
	    {   while(flag!=1)  
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
	    }
	    else
	    {
	    	while(flag!=1)  
	        {  
	            while((a[loc]>=a[right]) && (loc!=right))  
	            	right--;  
	            if(loc==right)  
	            	flag =1;  
	            else if(a[loc]<a[right])  
	            {  
	                temp = a[loc];  
	                a[loc] = a[right];  
	                a[right] = temp;  
	                loc = right;  
	            }  
	            if(flag!=1)  
	            {  
	                while((a[loc] <= a[left]) && (loc!=left))  
	                left++;  
	                if(loc==left)  
	                flag =1;  
	                else if(a[loc]>a[left])  
	                {  
	                    temp = a[loc];  
	                    a[loc] = a[left];  
	                    a[left] = temp;  
	                    loc = left;  
	                }  
	            }
	        }
	    }  
        return loc;
	}
	
	static int Random(int min,int max)
	{
        int range = max - min + 1; 
        int rand = (int)(Math.random() * range) + min;
        return rand;
	}
	public static void main(String Art3mis[])
	{	
		for(int i=0;i<1000;i++)
		{
			int n=Random(0,1000);
			int c=0;
			while(c==0)
			{	for(int j=0;j<1000;j++)
				{
					if(n==a[j])
						c=1;
				}
				if(c==0)
				{	a[i]=n;
					break;
				}
				else
				{
					 n=Random(0,1000);
					 c=0;
				}
			}
		}
		count=0;
		System.out.println("Ascending Order");
		long startTime1 = System.currentTimeMillis();
		QuickSort(a,0,999,0);
		long endTime1 = System.currentTimeMillis();
		System.out.println("That took " + (endTime1 - startTime1)+ " milliseconds");
	/*	for(int i=0;i<1000;i++)
		{	System.out.println(a[i]+" ");
		} */
		System.out.println("Recursive funtion called:"+count);
		System.out.println();
		System.out.println("Descending Order");
		count=0;
		long startTime2 = System.currentTimeMillis();
		QuickSort(a,0,999,1);
		long endTime2 = System.currentTimeMillis();
		System.out.println("That took " + (endTime2 - startTime2)+ " milliseconds");
	/*	for(int i=0;i<1000;i++)
		{	System.out.println(a[i]+" ");
		} */
		System.out.println("Recursive funtion called:"+count);
		System.out.println();
		System.out.println("Descending Order");
		count=0;
		long startTime3 = System.currentTimeMillis();
		QuickSort(a,0,999,1);
		long endTime3 = System.currentTimeMillis();
		System.out.println("That took " + (endTime3 - startTime3)+ " milliseconds");
	/*	for(int i=0;i<1000;i++)
		{	System.out.println(a[i]+" ");
		} */
		System.out.println("Recursive funtion called:"+count);
		System.out.println();
		System.out.println("Same Number");
		count=0;
		for(int i=0;i<1000;i++)
		{	a[i]=5;
		} 
		long startTime4 = System.currentTimeMillis();
		QuickSort(a,0,999,0);
		long endTime4 = System.currentTimeMillis();
		System.out.println("That took " + (endTime4 - startTime4)+ " milliseconds");
		System.out.println("Recursive funtion called:"+count);
	}


}