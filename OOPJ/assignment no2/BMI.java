 import java.util.*;
 class bmi_calc{
private float height;
private float weight;
float BMI;

bmi_calc(){
    this.height=0;
    this.weight=0;
}
bmi_calc(float height,float weight){
    this.height=height;
    this.weight=weight;
}

public float get_height(){
    return this.height;
}

public float get_weight(){

    return this.weight;
}

public void set_height(float height){
    this.height=height;
}

public void set_weight(float weight){
    this.weight=weight;
}

void calc_bmi(){

     this.BMI=this.weight/(this.height*this.height);
}

void print_bmi(){

    System.out.println("The BMI of the user for height "+this.height+" and weight "+this.weight+" is "+BMI);
}

}

class BMI{
public static void main(String[] args) {
   float height,weight,BMI;

    System.out.println("Enter your height and Weight for your BMI ");
    System.out.print("Enter height : ");
    Scanner sc= new Scanner (System.in);
    height=sc.nextFloat();
    System.out.print("\nEnter Weight : ");
    weight=sc.nextFloat();

    bmi_calc b=new bmi_calc(height,weight);

    b.calc_bmi();
    b.print_bmi();

    
    
}

}