package arrayoperations;
import java.util.Scanner;

public class arraymain {

	static int  menu() {
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Accept an array");
		System.out.println("2.Display the contents");
		System.out.println("3.Calculate and display the sum");
		System.out.println("4.Calculate and display the average");
		System.out.println("5.Find and display the largest element in the array.");
		System.out.println("6.Find and display the smallest element in the array");
		System.out.println("7.Sort the array in ascending");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int arr[];
		System.out.println("Enter number of array elements");
		arr= new int [sc.nextInt()];
		System.out.println("Enter array elements ");
		for (int i=0;i<arr.length;i++) 
		{	
			System.out.print(" Enter value at index : "+i);
			arr[i]=sc.nextInt();	
		}
		int choice;
		while((choice=arraymain.menu())!=0)
		{
			switch(choice) {
				case 1:{
					arrayfunctions.accept(arr);
					
				}
				break;
				
				case 2:{
					arrayfunctions.display(arr);
				}
				break;
				case 3:{
					arrayfunctions.sum(arr);
				}
				break;	
				case 4:{
					arrayfunctions.average(arr);
				}
				break;	
				case 5:{
					arrayfunctions.largest(arr);
				}
				break;
					
				case 6:{
					arrayfunctions.smallest(arr);
				}
				break;
					
				case 7:{
					arrayfunctions.sort(arr);
				}
				break;
					
				
			
			
			
			}
			
		}

	}

}
