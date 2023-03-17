import java.util.Scanner;

public class numbers{
		public static void numberseries(int a,int num)
	{
		
		if( num<a)
		{	
	        num++;
			System.out.println(num+" ");
			numberseries(a,num);
		}
		else 
		return;
	
	
		
			
		
	}
	
	public static void main(String args []){
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the last element of the series");
		int a =sc.nextInt();
		numberseries(a,0);
	}
	
	
}