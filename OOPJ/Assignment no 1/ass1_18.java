public class ass1_18 {
    static int  add(int num1,int num2){
        return (num1+num2);

}

    public static void main(String[] args) {
        int num1=10;
        int num2=30;
        if(num1<num2)
        {
            System.out.println(num2+" is greater than "+num1);
        }
        else 
        System.out.println(num1+" is greater than "+num2);

        int result=add(num1,num2);
        System.out.println(result);
        
    }
    
}
