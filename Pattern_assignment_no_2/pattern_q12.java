public class pattern_q12
{
public static void main(String args[])
{int num=5;
for(int i=0;i<=num;i++){
for(int j=num-i;j>=1;j--)
{
	System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print(i+" ");
}
System.out.println();
}
}
}