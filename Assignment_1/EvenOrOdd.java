import java.util.*;
public class EvenOrOdd{

public static void main (String []args)
{
//program to identify given number is even or odd
Scanner sc=new Scanner (System.in);

int a=66;
int b=45;
System.out.println("enter the number to check");
int c= sc.nextInt();

if (c%2==0)
{
System.out.println("the current number is Even");  
}
else
{
System.out.println("the current number is odd");
}
}

}