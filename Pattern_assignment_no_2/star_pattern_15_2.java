public class star_pattern_15_2{
public static void main(String args[])
{int num=10;
for(int i=0;i<=num;i++)
{
	for(int k=0;k<=num;k++)
	{
		if(k==0||k==i||i==num)
		{
			System.out.print("*");
		}
		else 
		{
			System.out.print(" ");
		}
		}
	System.out.println();
	
}
}
}