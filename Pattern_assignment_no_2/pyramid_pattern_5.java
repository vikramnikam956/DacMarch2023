public class pyramid_pattern_5 {
   public static void main(String[] args) {
      int num = 5;  
      for(int i=num;i>=1;i--)
	  {
		  for(int j=0;j<=i;j++)
		  {
			  System.out.print("  ");
		  }
		  for(int j=i;j<=num;j++)
		  {
			  System.out.print(j+" ");
		  }
		  for(int j=num-1;j>=i;j--)
		  {
			 System.out.print(j+" "); 
		  }
		  System.out.println();
	  }
   }
}
