class Prims
{
	public static void main(String Art3mis[])
	{
		int[][] a={{0,9,5,2,0},{9,0,0,6,5},{5,0,0,4,5},{2,6,4,0,4},{0,5,5,4,0}};
	/*	for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.println(a[i][j]);
			}
		} */
		String b=new String();
		int tw=0;
		int z=0;
		b+='a';
		for(int m=0;m<5;m++)
		{
			a[m][0]=0;
		}
		for(z=0;z<4;z++)
		{	
			int minrow=0;
			int mincol=0;
			for(int i=0;i<=z;i++)
			{	
				int row=(int)b.charAt(i)-97;
			//	System.out.println(row);
				for(int j=0;j<5;j++)
				{	
					if(a[row][j]!=0)
					{	if(a[row][j]<a[minrow][mincol]||a[minrow][mincol]==0)
						{	
							minrow=row;
							mincol=j;
						}
					//	
					}
				}
			}
			System.out.println(a[minrow][mincol]);
			if(a[minrow][mincol]!=0)
			{	
				b+=(char)(97+mincol);
				tw+=a[minrow][mincol];
				a[minrow][mincol]=0;
				a[mincol][minrow]=0;
				for(int m=0;m<5;m++)
				{
					a[m][mincol]=0;
					a[m][0]=0;
				}


			}
			
		
			

		}
		System.out.println(b);
		System.out.println("Total Weight:"+tw);

	}
}