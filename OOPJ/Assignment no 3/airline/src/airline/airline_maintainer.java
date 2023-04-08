package airline;
import Flight_data.*;
import java.util.Scanner;
public class airline_maintainer {
	String name;
	String email;
	long contact_no;
	Boeing747[] arr=new Boeing747[30];
	Scanner sc= new Scanner (System.in);
	Boeing747 obj= new Boeing747();
	static int count;


void user_reg() {
	System.out.println("Enter Your name");
	this.name=sc.next();
	System.out.println("Enter your email id");
	this.email=sc.next();
	System.out.println("Enter Phone no");
	this.contact_no=sc.nextLong();
}
boolean flight_availability() {
	if(obj.seat_full())
	System.out.println("Seats are empty");
	
	return obj.seat_full();
	
} 
void seat_reservation() {
	if(count!=30&&obj.seat_full())
	{ this.user_reg();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==null)
			{	
				arr[i]= new Boeing747(this.name,this.email,this.contact_no);
				arr[i].bookseat();
				count++;
				break;
			}
		}
	}
}
void view_reservations() {
	if(this.count!=0)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=null)
			{	System.out.println("Index ="+i);
				this.print_tickets(i);
			}
		}
	}
	else
		System.out.println("No tickets are booked");
	
	
}
void print_tickets(int j) {
	
	
		if(arr[j]!=null)
		{
			System.out.println(" Name 	    : "+arr[j].name);
			System.out.println("Flight Name : "+arr[j].flight_name);
			System.out.println(" Seat Type  : "+arr[j].seat_type);
			System.out.println("Price       : "+arr[j].price);
			System.out.println("Ticket No   : "+arr[j].ticket_no);
			
			
		}
	
}
void cancel_reservation() {
	
	this.view_reservations();
	System.out.println("Enter the index to remove");
	arr[sc.nextInt()]=null;
}
}
