import java.util.Scanner;
public class find_lcm{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int hcf=0,lcm=0;
for(int i=a;i>=1;i--)
{
	if((a%i==0)&&(b%i==0))
	{
		hcf=i;
		break;
	}
	
}

lcm=(a*b)/hcf;
System.out.println("the hcf and lcm are "+hcf+" "+lcm);
}
} 