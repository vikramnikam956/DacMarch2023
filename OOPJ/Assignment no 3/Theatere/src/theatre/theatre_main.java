package theatre;
import java.util.Scanner;

public class theatre_main {
	static Scanner sc= new Scanner (System.in);
	static int menu() {
		System.out.println("1.bookTickets");
		System.out.println("2.check_seats");
		System.out.println("3.displayChart");
		System.out.println("4.check total seats sold");
		System.out.println("0.Exit");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		theatre_mgmt obj= new theatre_mgmt();
		
		
		int choice;
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			
			case 1:obj.bookTickets();
				break;
				
			case 2:obj.check_seats();
				break;
			case 3:obj.displayChart();
				break;
			case 4:obj.check_seats();
			break;
			}
			
			
		}
	}

	}
