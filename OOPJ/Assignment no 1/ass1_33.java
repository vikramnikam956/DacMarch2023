import java.util.*;
public class ass1_33 {
    static void add(char choice,int num,int num2){
        switch(choice)
        {
   
       case '+':System.out.println("addition is "+(num+num2));
       break;
       case '-':System.out.println("subtraction is "+(num-num2));
       break;
       case '*':System.out.println("multiplication is "+(num*num2));
       break;
       case '/': System.out.println("division is "+(num/num2));  
       break;
       
        }
        

    }
    static void add(char choice,float num,float num2){
        switch(choice)
        {
   
       case '+':System.out.println("addition is "+(num+num2));
       break;
       case '-':System.out.println("subtraction is "+(num-num2));
       break;
       case '*':System.out.println("multiplication is "+(num*num2));
       break;
       case '/': System.out.println("division is "+(num/num2));  
       break;
       
        }
        

    }
    static void add(char choice,double num,double num2){
        switch(choice)
        {
   
       case '+':System.out.println("addition is "+(num+num2));
       break;
       case '-':System.out.println("subtraction is "+(num-num2));
       break;
       case '*':System.out.println("multiplication is "+(num*num2));
       break;
       case '/': System.out.println("division is "+(num/num2));  
       break;
       
        }
        

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Type of number entered \n float=f, double=d, integer=i");
        
        
        sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        char choice=sc.next().charAt(0);
        System.out.println("Enter your choice + - / * ");
        char choice2=sc.next().charAt(0);
        switch(choice){
            case 'f':{ Float num=new Float(args[0]);
                Float num2=new Float(args[1]);
                add(choice2,num,num2);

            }
            break;
            case 'd':{Double num=new Double(args[0]);
                Double num2=new Double(args[1]);
                add(choice2,num,num2);

            }
            break;
            case 'i':{Integer num=new Integer(args[0]);
                Integer num2=new Integer(args[1]);
                add(choice2,num,num2);

            }
            break;


        }

    
     
    
     
    
     
    }
}
