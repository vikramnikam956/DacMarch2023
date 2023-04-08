package warehouse;
import java.util.Scanner;
public class warehouse_main {
static Scanner sc= new Scanner (System.in);
	static int menulist() {
	System.out.println("1.Add item to shelf");
	System.out.println("2.Remove item from shelf");
	System.out.println("3.Display contents of all shelves");
	System.out.println("0.Exit");
	return sc.nextInt();
}
	public static void main(String[] args) {
		warehouse_operation w1 = new warehouse_operation();
		int choice ;
		while((choice=menulist())!=0)
		{
			switch(choice)
			{
			case 1: w1.add();
			break;
			case 2: w1.remove();
			break;
			case 3: w1.display();
			break;
			
			}
		
		}
	}

}
