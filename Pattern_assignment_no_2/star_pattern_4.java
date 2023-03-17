public class star_pattern_4{
	public static void main(String args[])
	{int num=7;
		for(int i=num;i>=0;i--)
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