public class pyramid_pattern_7
{
public static void main(String args[])
{
int num=5;
for(int i=num;i>=0;i--)
{
	
	for(int j=num;j>=i;j--)
	{
		System.out.print(" ");
	}
	for(int j=1;j<=i;j++)
	{
		System.out.print(i+" ");
	}
	System.out.println();
}
}
}