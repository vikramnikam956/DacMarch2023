import java.util.*;
public class small_num{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the three number");
int a =sc.nextInt();
int b =sc.nextInt();
int c =sc.nextInt();
int small=0;
if (a<b)
{
	small=(a<c)?a:c;
}
else 
{
	small=(b<c)?b:c;
}

System.out.println(small+" is the smallest number");

}

}