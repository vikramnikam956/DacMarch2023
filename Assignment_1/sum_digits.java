import java.util.*;
public class sum_digits{
public static void main(String args[])
{
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number to find sum of digits");
int num=sc.nextInt();
int sum=0;


while(num!=0)
{
	sum=sum+num%10;
	num=num/10;
	
}
System.out.println(sum);
}
}