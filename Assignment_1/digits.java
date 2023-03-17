import java.util.*;
import java.io.*;
public class digits {
	
public static void main(String [] args)
{
// print the digits of a given number
	System.out.println("enter the number to print digits");
	Scanner sc=new Scanner (System.in);
	int num=sc.nextInt();
	String string_num=Integer.toString(num);
    for (int i=0;i < string_num.length();i++)
	{
		System.out.println(string_num.charAt(i));
		
	}	
   
}


}