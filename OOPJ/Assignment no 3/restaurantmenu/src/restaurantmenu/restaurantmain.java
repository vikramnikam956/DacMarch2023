package restaurantmenu;
import java.util.Scanner;
enum menu{
	EXIT(12),PASTA(1000),CHICKEN(1500),BIRYANI(1250),DAL(500),SUSHI(2500);
	
	int num;
	menu(){
		
	}
	menu(int i) {
		this.num=i;
	}
	int getPrice(){
		
		
		return this.num;
	}
}

public class restaurantmain {
	static Scanner sc= new Scanner (System.in);
	static menu menu() {
		System.out.println(menu.PASTA.ordinal()+" "+menu.PASTA.name()+" : "+menu.PASTA.getPrice());
		System.out.println(menu.CHICKEN.ordinal()+" "+menu.CHICKEN.name()+" "+menu.CHICKEN.getPrice());
		System.out.println(menu.BIRYANI.ordinal()+" "+menu.BIRYANI.name()+" "+menu.BIRYANI.getPrice());
		System.out.println(menu.DAL.ordinal()+" "+menu.DAL.name()+" "+menu.DAL.getPrice());
		System.out.println(menu.SUSHI.ordinal()+" "+menu.SUSHI.name()+" "+menu.SUSHI.getPrice());
		System.out.print("Enter Your Choice :");
		int x= sc.nextInt();
		return menu.values()[x];
	}
	public static void main(String[] args) {
		float price;
		menu choice;
		while((choice=menu())!=menu.EXIT) {
			switch(choice)
			{
			case PASTA:{System.out.println("Enter Quantity");
						price=(sc.nextInt())*menu.PASTA.getPrice();
						System.out.println("The Bill is "+price);
			}
			break;
			case CHICKEN:{System.out.println("Enter Quantity");
			price=(sc.nextInt())*menu.CHICKEN.getPrice();
			System.out.println("The Bill is "+price);
				
			}
			break;
			case BIRYANI:{
				System.out.println("Enter Quantity");
				price=(sc.nextInt())*menu.BIRYANI.getPrice();
				System.out.println("The Bill is "+price);
			}
			break;
			
			case DAL:{
				System.out.println("Enter Quantity");
				price=(sc.nextInt())*menu.DAL.getPrice();
				System.out.println("The Bill is "+price);
			}
			break;
			case SUSHI:{
				System.out.println("Enter Quantity");
				price=(sc.nextInt())*menu.SUSHI.getPrice();
				System.out.println("The Bill is "+price);
			}
			break;
			
			
			}
			
		}
	}

}
