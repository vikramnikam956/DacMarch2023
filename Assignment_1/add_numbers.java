import java.util.Scanner;
public class add_numbers{

public static void main(String args[])
{
System.out.println("Enter the two numbers");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for (int i=1;i<=b;i++)
{
	a++;
}
System.out.println("addition of the two numbers is "+a);
}
}