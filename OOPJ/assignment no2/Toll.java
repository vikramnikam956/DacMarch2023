import java.util.Scanner;
class toll_calc{
    String vehicle_type;
    int num_axles;
    double dist_travelled;
    double toll_fee;
    double total_amt_due;
    toll_calc(){

    }
    public toll_calc(String vehicle_type, int num_axles, double dist_travelled, double toll_fee,double total_amt_due) 
    {
        this.vehicle_type = vehicle_type;
        this.num_axles = num_axles;
        this.dist_travelled = dist_travelled;
        this.toll_fee = toll_fee;
        this.total_amt_due = total_amt_due;
    }

    void calculate_toll_fee(String vehicle_type,int num_axles){
        if(vehicle_type.equalsIgnoreCase("car")||vehicle_type.equalsIgnoreCase("van")||vehicle_type.equalsIgnoreCase("bus"))
        {
            this.toll_fee=(this.dist_travelled*this.num_axles*0.25);
            this.total_amt_due=2+this.toll_fee;

        }
        else if(vehicle_type.equalsIgnoreCase("truck"))
        {
            this.toll_fee= (this.dist_travelled*this.num_axles*0.50);
        }


    }
    void generate_bill(){
        System.out.println(" vehicle type    : "+this.vehicle_type);
        System.out.println(" number of axles : "+this.num_axles);
        System.out.println(" Distance        : "+this.dist_travelled);
        System.out.println(" Toll Fee        : "+this.toll_fee);
        System.out.println(" processing fee  : "+2);
        System.out.println(" Total Amt Due   :"+this.total_amt_due);

    }
    int show_menu(){
        Scanner sc= new Scanner (System.in);
        System.out.println(" Enter the details:\n1. Enter vehicle type (car, van, bus, or truck)\n2. Enter number of axles\n3. Enter distance travelled\n4. Calculate toll fee\n5. Generate bill\n6. Exit");
        return sc.nextInt();
        
    }

    
    
    



}
public class Toll {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        toll_calc n1= new toll_calc();
        int choice;
        while( ( choice = n1.show_menu( ) ) != 0 )
        {
            switch(choice)
            {   case 1:System.out.print("Enter vehicle type (car, van, bus, or truck) :");
                n1.vehicle_type=sc.next();
                break;
                case 2:System.out.print("Enter number of axles :");
                n1.num_axles=sc.nextInt();  
                break;
                case 3:System.out.print("Enter distance travelled :");
                n1.dist_travelled=sc.nextDouble();
                case 4:System.out.print("Calculate toll fee :");
                n1.calculate_toll_fee(n1.vehicle_type, n1.num_axles);
                case 5:System.out.print("Generate bill1 :");
                n1.generate_bill();
            }

        }
        
    }
    
}
