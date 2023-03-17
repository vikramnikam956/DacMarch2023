public class compound_int{
public static void main(String args[])
{
   long loan =50000000;
   int year=5;
   float roi=1.75f;
   double amount= loan*((1+roi/100)*(1+roi/100)*(1+roi/100)*(1+roi/100)*(1+roi/100));
   
   System.out.println("the amount is"+amount);
   System.out.printf("the amount is %.2f"+amount);
}
}