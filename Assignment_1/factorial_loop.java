import java.util.*;
class factorial_loop
{
public static void main(String [] args)
{  //Find factorial using loop
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the number to find the factorial");
   int a=sc.nextInt();
   int result=1;
   int num=a;
   for(int i=1;i<=a;i++)
   {    
   result=result*i;
   }
   
System.out.println("the factorial of the number is "+result);
}


}