public class star_pattern_12{
	public static void main(String args[])
	{int num=7;
		for(int i=num;i>=0;i--)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			if (i==0)
				break;
			System.out.println("");
		}
		for(int i=1;i<=num;i++)
		{ if (i==1)
			continue;
			
			for(int j=1;j<=i;j++)
			{ 
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}