import java.util.Scanner;
class bill{
String customerName;
long phoneNo;
int noOfCalls;
double durnOfCalls;
bill(){
    this.customerName=null;
    this.phoneNo=0;
    this.noOfCalls=0;
    this.durnOfCalls=0;
}
bill(String customerName,long phoneNo,int noOfCalls,double durnOfCalls){
    this.customerName=customerName;
    this.phoneNo=phoneNo;
    this.noOfCalls=noOfCalls;
    this.durnOfCalls=durnOfCalls;
}
double calculate_bill(){
if(this.noOfCalls<100&&this.noOfCalls>0)
{
   return ((this.noOfCalls*50)/100);
}
else if(this.noOfCalls>100)
{
    return ((((this.noOfCalls-100)*25+5000)/100)+10);
}
else {
    System.out.println("Invalid No Of Calls");
}
return 0;

}
void accept_record(){
Scanner sc= new Scanner(System.in);
System.out.println("Enter your name");
this.customerName=sc.nextLine();
System.out.println("Enter phone no");
this.phoneNo=sc.nextLong();
System.out.println("Enter Number Of Calls");
this.noOfCalls=sc.nextInt();
System.out.println("Enter duration Of Calls in minutes");
this.durnOfCalls=sc.nextDouble();
}


}

public class phonebill {
    public static void main(String[] args) {
        bill b1= new bill();
        b1.accept_record();
        double bill = b1.calculate_bill();
        System.out.println("The amount of bill for customer "+b1.customerName+" is "+bill+" Dollars");
        
        
    }
    
}
