public class star_pattern_5{
	public static void main(String args[])
	{int num=5;
		for(int i=num+2;i>=0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=num+2;k>=((i*2)-1);k--)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}