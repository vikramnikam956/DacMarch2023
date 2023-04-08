package airline;
import java.util.Scanner;
public class airline_main {
static Scanner sc= new Scanner (System.in);
	static int menulist() {
		System.out.println("0.Exit");
		System.out.println("1.User registration");
		System.out.println("2.Flight availability");
		System.out.println("3.Seat Reservation");
		System.out.println("4.View Reseration");
		System.out.println("5.Cancel reservation");
		return sc.nextInt();
}

	public static void main(String[] args) {
		airline_maintainer s1=new airline_maintainer();
		int choice; 
		while((choice=menulist())!=0 )
		{
			
			switch (choice)
			{
			case 1: s1.user_reg();
			break;
			case 2: s1.flight_availability();
			break;
			case 3: s1.seat_reservation();
			break;
			case 4: s1.view_reservations();
			break;
			case 5: s1.cancel_reservation();
			}
		}
		
	
	}

}
