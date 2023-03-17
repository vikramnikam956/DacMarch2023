import java.util.*;
public class factorial{

public static int  fact(int num)
{
	if (num==0)
	return 1;
	else
	return num*fact(num-1);


	
}

public static void main(String [] args)
{ Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find factorial");
	int a=sc.nextInt();
	int result=fact(a);
	System.out.println("rhe factorial of number "+a+"is "+ result);
	
}

}