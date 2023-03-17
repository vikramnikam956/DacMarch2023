import java.util.*;
public class factors{
public static void main(String args [ ]){
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number to find factors");
	int a =sc.nextInt();
for(int i=1;i<=(a/2);i++)
{
	if(a%i==0)
	{
		System.out.println(i+"\t");
	}
}


}

}
