package restaurant;
import java.util.Arrays;
import java.util.Scanner;
public class restaurant_manager {
	int count=0;
	void add_new(restaurant_main arr[]){
		Scanner sc= new Scanner(System.in);
		if(count!=10)
		for(int i=0;i<arr.length;i++)
		{	if(arr[i]==null) {
			arr[i]= new restaurant_main();
			count++;
			System.out.println("Enter Dish Name");
			arr[i].dish_name=sc.next();
			System.out.println("Enter Dish price");
			arr[i].dish_price=sc.nextFloat();
			break;
			}
		
		}
		else 
			System.out.println("The Menu is Full");
		
	}
	
	void remove_one(restaurant_main arr[]) {
		Scanner sc= new Scanner(System.in);
		if(count!=0)
		{ 
			this.view_menu(arr);
			System.out.println("Enter the index to remove the dish");
			arr[sc.nextInt()]=null;
			
		}
		else {
			System.out.println("Menu is empty");
		}
		
		
		
	}
	
	void modify_price(restaurant_main arr[]) {
		Scanner sc= new Scanner(System.in);
		if(count!=0)
		{	this.view_menu(arr);
			System.out.println("Enter the index to make changes");
			int num=sc.nextInt();
			System.out.println("Enter Price ");
			arr[num].dish_price=sc.nextFloat();
		}
		else 
		{
			System.out.println("Menu is empty");
		}
		
		
	}
	
	void view_menu(restaurant_main arr[]) {
		if(count!=0)
		{System.out.println(count);
		 
			for(int i=0;i<arr.length;i++)
			{	
				if(arr[i]!=null)
				{
				System.out.println(i+" "+arr[i].dish_name+" = "+arr[i].dish_price);
				
				}
			}
		}
		else
			System.out.println("Menu is Empty");
		
		
	}

}
