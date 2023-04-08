package restaurant;
import java.util.Scanner;
public class restaurant_main {
	String dish_name;
	float dish_price;
	
	static int menulist() {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.View the current menu with prices");
		System.out.println("2.Add a new dish to the menu");
		System.out.println("3.Remove a dish from the menu");
		System.out.println("4.Modify the price of a dish on the menu");
		System.out.println("0.Exit the program");
		return sc.nextInt();
	}
	
	@Override
	public String toString() {
		return "restaurant_main [dish_name=" + dish_name + ", dish_price=" + dish_price + "]";
	}


	public static void main(String[] args) {
	restaurant_main [] arr= new restaurant_main[10];
	restaurant_manager obj= new restaurant_manager();
	int choice;
	while((choice=menulist())!=0)
	{
		switch(choice)
		{
		
		case 1:obj.view_menu(arr);
		break;
		case 2:obj.add_new(arr);
		break;
		case 3:obj.remove_one(arr);
		break;
		case 4:obj.modify_price(arr);
		break;
		
		
		}
	}
	}

}
