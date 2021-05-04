import java.util.Scanner;
class Combination
{
	public static void main(String Art3mis[])
	{
		Scanner s=new Scanner(System.in);
		String st=s.next();
		char[] ch = new char[st.length()];
		for(int i=0;i<st.length();i++)
		{
			ch[i]=st.charAt(i);
		}
		CombinationFinder(ch,0,st.length()-1);


	}
	public static void CombinationFinder(char st[],int start,int end)
	{
		if(start==end)
			System.out.println(st);
		else
		{	for(int i = start; i <=end; i++)
			{  
	  			st = Swap(st,start,i);
	            CombinationFinder(st, start+1, end);
	            st = Swap(st,start,i);
			}  
		}
  		
	}
	public static char[] Swap(char st[],int i,int j)
	{
		char temp=st[i];
		st[i]=st[j];
		st[j]=temp;
		return st;
	}
}