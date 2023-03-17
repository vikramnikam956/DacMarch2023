import java.util.Scanner;
public class reverse_num{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter number ");
int a =sc.nextInt();
String str=String.valueOf(a);
String str2="";
for(int i=str.length()-1;i>=0;i--)
{
	str2=str2+str.charAt(i);
}
int b=Integer.parseInt(str2);
System.out.println("the reversed number is "+b);
}
}