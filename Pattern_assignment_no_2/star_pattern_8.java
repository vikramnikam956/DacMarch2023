public class star_pattern_8{
	public static void main(String args[])
	{int num=5;
		for(int i=0;i<=num-1;i++)
		{
			for(int j=0;j<i;j++)
			{    
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(int i=0;i<=num;i++)
		{
			for(int j=num;j>i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}