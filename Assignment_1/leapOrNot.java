import java.util.*;
public class leapOrNot{
public static void main(String args[])
{Scanner sc=new Scanner (System.in);
System.out.println("enter the year to check leap year or not");
int a =sc.nextInt();
if(a%4==0)
	System.out.println("the year "+a+" is a leap year");
else if (a%4!=0)
	System.out.println("the year is not a leap year");
else 
	System.out.println("INVALID INPUT");




}

}