public class pattern_q9
{
public static void main(String args[])
{int num=7;
for(int i=0;i<=num;i++){
for(int j=num-i;j>=1;j--)
{
	System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print((char)(k+64)+" ");
}
System.out.println();
}
}
}