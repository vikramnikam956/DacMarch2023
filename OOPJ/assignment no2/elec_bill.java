import java.util.Scanner;

class ElectricityBill {
    String customerName;
    double unitsConsumed;
    double billAmount;
    
    public ElectricityBill() {
        this.customerName = "Default";
        this.unitsConsumed = 0.0;
        this.billAmount = 0.0;
    }

    public ElectricityBill(String customerName, double unitsConsumed, double billAmount) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = billAmount;
    }

    public void calculateBill() {
        if (this.unitsConsumed <= 100) {
            this.billAmount = this.unitsConsumed * 5;
        } else if (this.unitsConsumed <= 300) {
            this.billAmount = ((this.unitsConsumed - 100) * 7) + 500;
        } else if (this.unitsConsumed > 300) {
            this.billAmount = ((this.unitsConsumed - 300) * 10) + 1400;
        } else {
            System.out.println("Invalid Input");
        }
    }
}

public class elec_bill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter units consumed: ");
        double units = 0.0;
        units = scanner.nextDouble();
        if(units<0)
        {
            System.out.println("Invalid units Input");

        }
        else{
        ElectricityBill bill = new ElectricityBill(name, units, 0.0);
        bill.calculateBill();
        System.out.println("The electricity bill for " + bill.customerName + " is " + bill.billAmount);
    }
}
}

