public class star_pattern_10{
	public static void main(String args[])
	{int num=7;
		for(int i=num;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=0;k<=num;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}