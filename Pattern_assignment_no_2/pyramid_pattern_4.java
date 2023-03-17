public class pyramid_pattern_4
{
public static void main(String args[])
{
int num=5;
for(int i=1;i<=num;i++)
{
	for(int j=num;j>=i;j--)
	{
		System.out.print("  ");
	}
	for(int k=1;k<=i;k++)
	{
		System.out.print(k+" ");
	}
	for(int k=i-1;k>=1;k--)
	{
		System.out.print(k+" ");
	}
	System.out.println();
	
}
}
}