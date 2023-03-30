public class ass1_13 {
    public static void main(String[] args) {
        short num=455;
        System.out.println("Number is"+num);
        String str=String.valueOf(num);
        System.out.println("String is "+str);
        Short num2=new Short(num);
        System.out.println("Short value is "+num2);
        String str2=new String("12345");
        Short num4=new Short(str2);
        System.out.println("Short after string instance "+num4);



        
    }
    
}
