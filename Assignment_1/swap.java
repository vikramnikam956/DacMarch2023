import java.util.Scanner;
public class swap{
 
public static void main(String args[] )
{
//swap two numbers and print
Scanner sc= new Scanner(System.in);
System.out.println("Enter the two numbers X and Y ");
System.out.println("Enter X ");
int x=sc.nextInt();
System.out.println("Enter y ");
int y=sc.nextInt();
x=x+y;
y=x-y;
x=x-y;

System.out.println(" X= "+x+" Y= "+y);

}


}