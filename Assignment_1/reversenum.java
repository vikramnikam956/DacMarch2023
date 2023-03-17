
import java.util.*;
public class reversenum{
public static void main(String args[])
{Scanner sc=new Scanner (System.in);
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
 num= Integer.parseInt(nstr);
 System.out.println("the reversed number is "+num);

}



}