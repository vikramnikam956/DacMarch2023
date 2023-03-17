import java.util.*;
public  class  pos_neg{
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
System.out.println("Enter the number to check");
int num=sc.nextInt();
if (num>0)
	System.out.println("The given number is positive");
else if(num<0)
	System.out.println("The given number is negative");
else if(num==0)
	System.out.println("The number is zero");
else
	System.out.println("INVALID INPUT");
}
}