public class star_pattern_2{
	public static void main(String args[])
	{int num=8;
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
		
	}

}