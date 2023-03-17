public class star_pattern_11{
	public static void main(String args[])
	{int num=8;
		for(int i=num;i>0;i--)
		{
			for(int k=num;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<num;j++)
			{
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
	}

}