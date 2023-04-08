package arrayoperations;
import java.util.Arrays;
import java.util.Scanner;
public class arrayfunctions {

	
	static void accept(int arr[]) {
		
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter number of array elements");
			arr= new int [sc.nextInt()];
			System.out.println("Enter array elements ");
			for (int i=0;i<arr.length;i++) 
			{	
				System.out.print(" Enter value at index : "+i);
				arr[i]=sc.nextInt();	
			}
			
	}
	
	static void display(int arr[]) {
		if(arr!=null)
		for(int ele:arr)
		{
			System.out.println(ele);
		}
		else System.out.println("Array is Empty");
	}
	static void sum(int arr[]) {
		int sum=0;
		if(arr!=null) {
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("The sum of array elements :");
		arrayfunctions.display(arr);
		System.out.println("sum = "+sum);
		}
		else System.out.println("Array is Empty");
	}
	static void average(int arr[]) {
		int average=0;
		if(arr!=null) {
		for(int i=0;i<arr.length;i++)
		{
			average=average+arr[i];
		}
		average=average/arr.length;
		System.out.println("Average is "+average);
		}
		else System.out.println("Array is Empty");
	}
		
	static void largest(int arr[]) {
		int temp=arr[0];
		if(arr!=null) {
		for(int i=1;i<arr.length;i++)
		{
			if(arr[0]<arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("The largest element is  "+temp);
		}
		else 
			System.out.println("Array is Empty");
	}
		
	static void smallest(int[]arr) {
		int temp=arr[0];
		if(arr!=null) {
		for(int i=1;i<arr.length;i++)
		{
			if(arr[0]>arr[i])
			{
				temp=arr[i];
			}
		}
		System.out.println("The smallest element is "+temp);
		}
		else 
			System.out.println("Array is empty");
	}
	static void sort(int arr[]) {
		if(arr!=null) {
			Arrays.sort(arr);
			arrayfunctions.display(arr);	
		}
		else System.out.println("Array is Empty");
	}
}
