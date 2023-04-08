package sales;
import java.util.Scanner;
public class sales_management {
	Scanner sc= new Scanner (System.in);
	int index;
	sales_person [] arr= new  sales_person [50];
	static int count=0;
	
	void add()
	{
		if(count!=50)
		{
			for(int i=0;i<arr.length;i++) {
				
			if(arr[i]==null)
			{	arr[i]=new sales_person();
				System.out.println("Enter Name ");
				arr[i].name=sc.next();
				System.out.println("Enter Employee ID ");
				arr[i].empid=sc.nextInt();
				System.out.println("Enter the sales data");
				arr[i].accept_sales_data();
				count++;
				break;
			}
			
			
			}
				
		}
		
	}
	void update() {
		System.out.println("Enter the Employee id you wish to make changes");
		int id= sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{if(arr[i]!=null) {
			if(arr[i].empid==id)
			{
				arr[i].modify_sales_data();
				
			}
		}
		}
		
		
	}
	void total_sales_emp() {
		
		System.out.println("Enter Employee id for which you wanna get total sales");
		int id=sc.nextInt();
		double sum;
		for(int i=0;i<arr.length;i++)
		{if(arr[i]!=null) {
			if(arr[i].empid==id)
			{
				sum=arr[i].total_sales();
				System.out.println("The Total sales by employee with id "+id+" is "+sum);
			}
		}
		}
	
	}
	void total_sales() {
		double sales=0;
		for(int i=0;i<arr.length;i++)
		{	if(arr[i]!=null)
		{
			sales=sales+arr[i].total_sales();
		}	
		}
	System.out.println("The Total Sales of all employee is "+sales);
	}

}
