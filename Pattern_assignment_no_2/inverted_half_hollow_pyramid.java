public class inverted_half_hollow_pyramid{

public static void main (String args[])
{int num=5;
for(int i=num;i>=0;i--)
{
	for(int j=0;j<=i;j++)
	{   if(j==i||i==num||j==0)
		System.out.print("*");
	    else
	    System.out.print(" ");		
			
	}
System.out.println();
}
}

}