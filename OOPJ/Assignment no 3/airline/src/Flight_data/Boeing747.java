package Flight_data;
import java.util.*;

public class Boeing747 {
	public String name;
	String email;
	long contact_no;
	public String flight_name;
public String seat_type="economy";
public float price;
static int seat_economy=0;
static int seat_business=0;
static int seat_first=0;
public long ticket_no;
Scanner sc= new Scanner (System.in);
public Boeing747() {
	
}
public Boeing747(String name,String email,long contact_no){
	this.name=name;
	this.flight_name="Boeing747";
	this.email=email;
	this.contact_no=contact_no;
}
void seat_typefunc(String seat_type)
{
if(this.seat_type.equalsIgnoreCase("economy"))
{
this.seat_type="economy";
this.price=5000;
}
else if(this.seat_type.equalsIgnoreCase("business"))
{
	this.seat_type="Business";
	this.price=20000;	

}
else if(this.seat_type.equalsIgnoreCase("First")) {
	this.seat_type="First";
	this.price=25000;	
}
}
public void bookseat() {
	System.out.println("Enter seat type business, economy or first class");
	String str=sc.next();
	this.seat_typefunc(str);
	this.ticket_no();
	if(this.seat_type.equalsIgnoreCase("economy")&&seat_economy!=10)
	{
	  ++seat_economy;
	}
	else if(this.seat_type.equalsIgnoreCase("business")&&seat_economy!=10)
	{
		this.seat_type="Business";
		this.price=20000;	
    ++seat_business;
	}
	else if(this.seat_type.equalsIgnoreCase("First")&&seat_economy!=10) {
		this.seat_type="First";
		this.price=25000;	
	++seat_business;
	}
	else 
		System.out.println("Invalid details seat type ");
	
}
public void ticket_no() {
	Random random = new Random();
	String str="";
    this.ticket_no = 0L;
  for(int i=0;i<12;i++)
  {		
	
	str=str+Long.toString(random.nextInt(8));
	  
  }
  this.ticket_no=Long.parseLong(str);
}
public boolean seat_full()
{
if (this.seat_type.equalsIgnoreCase("business")&&seat_economy!=10)
{
		return true;
}
else if(this.seat_type.equalsIgnoreCase("first")&&seat_economy!=10)
{
		return true;
		
}
else if(this.seat_type.equalsIgnoreCase("economy")&&seat_economy!=10) {
	    return true;
}
else
	return false;
}

}
