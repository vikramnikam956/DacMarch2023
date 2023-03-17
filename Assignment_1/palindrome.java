import java.util.*;
public class palindrome{

public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
   System.out.println("enter the number to reverse");
int num=sc.nextInt();
char ch;

String nstr="";
String number= String.valueOf(num);
for (int i=0;i<number.length();i++)
{
	ch=number.charAt(i);
	nstr=ch+nstr;
}
 int rev= Integer.parseInt(nstr);
 if(num==rev)
 { 	System.out.println(num+" the reverse is "+rev);
	System.out.println("the given number is palindrome");
 }
else 
{
	System.out.println(num+" the reverse is "+rev);
    System.out.println("the given number is not a palindrome");
}
}
}