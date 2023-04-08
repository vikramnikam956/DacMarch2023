package theatre;
import java.util.Scanner;
public class theatre_mgmt {
	Scanner sc= new Scanner(System.in);
String arr[] [];
int count=0;
int count1=0;
double total_booked_amount;
int ticket_price;
String notbooked;
theatre_mgmt(){
	this.arr=new String [10][10];
	for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr.length;j++)
    	arr[i][j]="["+i+j+"]";
    }

	
	this.notbooked="[  ]";
	this.count=0;
	this.ticket_price=200;
	this.count1=0;
}

void displayChart() {
    for(int i=0;i<arr.length;i++)
    {	
    	for(int j=0;j<arr.length;j++)
    	{
    		System.out.print(arr[i][j]);
    	}
    	System.out.println();
    }
	
}
void check_seats() {
	for(int i=0;i<arr.length;i++)
    {	
    	for(int j=0;j<arr.length;j++)
    	{
    		if(arr[i][j].equals("[  ]"))
    		{
    			count1++;
    		}
    	}
    	
    }
	System.out.println("The total Seats sold are "+count1+" the total amount is "+(count1*this.ticket_price));
}
void bookTickets() {
	this.count=0;
	this.displayChart();
	int choice=1;
	while(choice==1) {
	System.out.println("Enter the row and column in the seat");
	System.out.print("row : ");
	int row=sc.nextInt();
	System.out.print("col : ");
	int col=sc.nextInt();
	if(row<=10&&row>=0&&col<=10&&col>=0) {
	if(arr[row][col].equals("["+row+col+"]"))
	{	if(count!=0)
		this.displayChart();
		arr[row][col]="[  ]";
		count++;
		System.out.println("Do you wanna book another seat?");
		System.out.print("1.yes 0.No : ");
		choice=sc.nextInt(); 
		if(choice!=0)
			continue;
		else 
			System.out.println("The total seats booked are "+count+" the price is "+(count*this.ticket_price));
		break;
	}
	
	else 
		System.out.println("Seat booked or doesnt exist");
	System.out.print("Do you wanna choose another seat");
	System.out.print("\n1.yes 0.No : ");
	choice=sc.nextInt();
	if(choice==1)
		break;
	}
	System.out.println("Seat booked or doesnt exist");
	System.out.print("Do you wanna choose another seat");
	System.out.print("\n1.yes 0.No : ");
	choice=sc.nextInt();
	}
	
	
}
}
