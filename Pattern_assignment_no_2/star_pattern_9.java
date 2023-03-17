public class star_pattern_9{
	public static void main(String args[])
	{int num=9;
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=num;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=num-1;i>0;i--)
		{
			for(int k=num;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}