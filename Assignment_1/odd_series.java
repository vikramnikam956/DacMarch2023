import java.util.Scanner;
public class odd_series{

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter the last digit of the series");
int a=sc.nextInt();
int i=1;
while(i<=a)
{
	System.out.println(i);
	i=i+2;
	
}

}
}