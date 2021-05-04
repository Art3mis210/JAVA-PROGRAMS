import java.util.*;
class Dijkstra
{
	public static void main(String Art3mis[])
	{	int edges[][]={{0,3,0,0,5},{0,0,8,5,3},{0,0,0,0,0},{0,0,2,0,0},{0,0,0,4,0}};
		Stack<Character> Visited= new Stack<Character>();
		int Source[]=new int[5];
		int mindistance[]=new int[5];
		for(int i=1;i<5;i++)
		{
			mindistance[i]=1000;
		}
		mindistance[0]=0;
		Visited.add((char)(97+0));
		try
		{	while(Visited.peek()!=null)
			{
				int j=(int)(Visited.peek())-97;
				
				int min=mindistance[j];
				for(int k=1;k<5;k++)
				{
					if(mindistance[k]>min+edges[j][k] && edges[j][k]!=0)
					{
						min+=edges[j][k];
						mindistance[k]=min;
						edges[j][k]=0;
						Source[k]=j;
						Visited.add((char)(k+97));
						break;
					}
					if(k==4)
					{
						if(edges[j][k]==0)
						{	Visited.pop();
							break;
						}

					} 
				}
			}
		}
		catch(Exception e)
		{

		}
		for(int i=0;i<5;i++)
		{
			System.out.print((char)(97+i)+"  ");
		}
		System.out.println();
		for(int i=0;i<5;i++)
		{
			System.out.print(mindistance[i]+"  ");
		}
	}
}