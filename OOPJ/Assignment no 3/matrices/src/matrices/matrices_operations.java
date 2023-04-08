package matrices;

public class matrices_operations {
	void addition(int arr1[][],int arr2[][],int row,int col,int row1,int col1){
		if(row==row1&&col==col1) { 
		int arr[][]= new int[row][col];
		 for(int i=0;i<arr1.length;i++)
		 {    for(int j=0;j<arr1.length;j++)
			 {
				arr[i][j]=arr1[i][j]+arr2[j][j];
			 }
		 }
		 
		 matirces_main.print(arr,arr.length,col);
		}
		else 
			System.out.println("can not perform this operation on the two arrays"); 
	 }
	 void subtract (int arr1[][],int arr2[][],int row,int col,int row1,int col1)
	 {if(row==row1&&col==col1) {
		  int arr[][]= new int[arr2.length][arr2.length];
		 for(int i=0;i<arr1.length;i++)
		 {    for(int j=0;j<arr1.length;j++)
			 {
				arr[i][j]=arr1[i][j]-arr2[j][j];
			 }
		 }
		 
		 matirces_main.print(arr,row,col);
	 }
	 else 
	 System.out.println("can not perform this operation on the two arrays");
	 }
	 void multiplication(int arr1[][],int arr2[][],int row,int col,int row1,int col1)
	 {if(col1==row1) {
        int arr[][]= new int[arr2.length][arr2.length];
		 for(int i=0;i<arr1.length;i++)
		 {    for(int j=0;j<arr1.length;j++)
			 {
				for(int k=0;k<arr.length;k++)      
			{      
				arr[i][j]+=arr1[i][k]*arr2[k][j];      
			}
			 }
		 }matirces_main.print(arr,arr.length,col);
		
	 }
	 else System.out.println("can not perform this operation on the two arrays");
	 }
	 void transpose (int arr1[][],int col)
	 {
		  int arr[][]= new int[arr1.length][arr1.length];
		 for(int i=0;i<arr1.length;i++)
		 {    for(int j=0;j<arr1.length;j++)
			 {
				arr[i][j]=arr1[j][i];
			 }
		 }
		 
		 matirces_main.print(arr,arr.length,col); 
	 }
}
