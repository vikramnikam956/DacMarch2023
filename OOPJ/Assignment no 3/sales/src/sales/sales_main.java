package sales;
import java.util.Scanner;
public class sales_main {
	static Scanner sc= new Scanner (System.in);
	static int menulist() {
		System.out.println("1.Add a new salesperson");
		System.out.println("2.Update an existing salesperson");
		System.out.println("3.View total sales for a salesperson");
		System.out.println("4.View total sales for all salespersons");
		System.out.println("0.Exit the program");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		sales_management obj=new sales_management();
		int choice;
		while((choice =menulist())!=0)
		{
			switch(choice)
			{
			case 1: obj.add();
			break;
			
			case 2: obj.update();
			break;
			
			case 3: obj.total_sales_emp();
			break;
			
			case 4:obj.total_sales();
			break;
			
			}
			
		}

	}

}
