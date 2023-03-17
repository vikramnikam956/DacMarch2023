public class star_pattern_7{
	public static void main(String args[])
	{   int num=5;
		for(int i=((num*2)+1);i>=0;i--)
		{   System.out.print("  ");
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=num;k>=((i*2)-1);k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=num;i>=0;i--)
		{
			for(int k=num;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<((i*2)-1);j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}