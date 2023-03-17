import java.util.*;
public class find_gcd{
public static void main(String args[])
{
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the two numbers to find HCF");
	int num1= sc.nextInt();
	int num2= sc.nextInt();
	int small= num1<num2?num1:num2;
	for (int i=small;i>0;i--)
	{
		if(num1%i==0&&num2%i==0)
		{
			System.out.println("the Hcf of"+num1+" and "+num2+" is "+i);
			break;
		}
		
	}
}
}