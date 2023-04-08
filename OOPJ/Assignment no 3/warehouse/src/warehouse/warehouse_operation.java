package warehouse;
import java.util.Scanner;
public class warehouse_operation {
	Scanner sc= new Scanner(System.in);
String arr[]=new String [10];
	int count=0;
	void add() {
		if(count!=10)
		{	System.out.println("Enter the name of the item to add and index number ");
		System.out.print("Enter Name of item: ");
		String str=sc.next();
		System.out.print("\nEnter Index number 1-10: ");
		arr[sc.nextInt()-1]=str;
		count++;	
		}
		else 
			System.out.println("The Shelf is Full");
		
	}
	void remove() {
		if(count!=0)
		{	System.out.println("Enter the name of the item to add and index number ");
		
		System.out.print("\nEnter Index number toi remove item from  1-10: ");
		arr[sc.nextInt()-1]=null;
			count--;
		}
		else 
			System.out.println("The Shelf is already Empty");
		
	}
	void display(){
		for(int i=0;i<arr.length;i++)
		{ 	if(arr[i]==null)
		{
			System.out.println("Shelf "+(i+1)+" : Empty");
		}
			if(arr[i]!=null)
			{
				System.out.println("Shelf "+(i+1)+" : "+arr[i]);
			}
		}
		
	System.out.println("Thank you for using the Warehouse Inventory Management System!");
	}
}
