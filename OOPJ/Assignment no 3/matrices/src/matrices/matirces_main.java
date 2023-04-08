package matrices;
import java.util.Scanner;
public class matirces_main {
  static Scanner sc= new Scanner(System.in);

	static int[][] accept_array(int row,int col){
		System.out.println("Enter the array  ");
		int arr1[][]=new int [row][col]; 
		for(int i=0;i<arr1.length;i++)
			 {    for(int j=0;j<arr1.length;j++)
				 {
					System.out.print("Enter the value of index "+i+" "+j+" : ");
					
					arr1[i][j]=sc.nextInt();
				 }
			 }
		return arr1;
	}
	static int menulist() {
		System.out.println("1.Addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		System.out.println("0.exit");
		
		return sc.nextInt();
	}
	static void print(int arr[][],int row,int col) {
		for(int i=0;i<arr.length;i++)
		 {    for(int j=0;j<arr.length;j++)
			 {
				System.out.print(" "+arr[i][j]);
				
				
			 }
		 System.out.println();
		 }
	}
		

	public static void main(String[] args) {
		
		System.out.println("Enter the number of rows and columns");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]= new int[row][col];
		arr=accept_array(row,col);
		
		System.out.println("Enter the number of rows and columns");
		 int row1=sc.nextInt();
		 int col1=sc.nextInt();
		int arr1[][]= new int[row1][col1];
		arr1=accept_array(row,col);
		matrices_operations obj=new matrices_operations();
		int choice;
			switch (choice=menulist())
			{
			case 1 :obj.addition(arr, arr1,row,col,row1,col1);
					
			break;
			case 2:obj.subtract(arr, arr1,row,col,row1,col1);
			break;
			case 3:obj.multiplication(arr, arr1,row,col,row1,col1);
			break;
			case 4:obj.transpose(arr, col);
			break;
			}
		}
	}


