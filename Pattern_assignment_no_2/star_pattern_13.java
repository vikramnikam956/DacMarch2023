public class star_pattern_13{
	public static void main(String args[])
	{ 
		int num=8;
		for(int i=num;i>=0;i--)
		{if(i==0)
			continue;
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
		
		for(int i=num;i>0;i--)
		{if(i==num)
			continue;
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