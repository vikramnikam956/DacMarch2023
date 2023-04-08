package sales;
import java.util.Arrays;
import java.util.Scanner;
public class sales_person {
	int empid;
	String name;
	double total_sales;
	float [] sales=new float[12]; 
	Scanner sc= new Scanner(System.in);

	void accept_sales_data() {
		System.out.println("Enter the data of sales per month");
		for(int i=0;i<sales.length;i++)
		{
			System.out.println("Enter the sales of month "+(i+1));
			sales[i]=sc.nextFloat();
		}
	}
	void modify_sales_data() {
		
		
	System.out.println("Enter the month you wanna modify 1-12");
	int index=sc.nextInt()-1;
	System.out.println("Enter the Sales");
	sales[index]=sc.nextFloat();
		
	}
	
	void print() {
		System.out.println(this);
	
		
		
	}
	double total_sales() {
		double sum=0;
		for(int i=0;i<sales.length;i++)
		{
			sum=sum+sales[i];
		}
		return sum;
	} 

	@Override
	public String toString() {
		return "sales_person [empid=" + empid + ", name=" + name + ", total_sales=" + total_sales + ", sales="
				+ Arrays.toString(sales) + ", sc=" + sc + "]";
	}
	
	
}
