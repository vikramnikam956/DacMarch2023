import java.util.*;
public class Gross_salary
{
public static void main(String args[])
{
double basic=10000.8989009;
float TA=5600.6778F;
double DA= (basic*14)/100;
double petrol_allowance= 7000.3443534546;
double tax_deduction= (1.76*basic)/100;
double gross_salary=basic+TA+DA+petrol_allowance-tax_deduction;
System.out.println("Basic Salary \t\t= "+basic);
System.out.println("TA \t\t\t= "+TA);
System.out.println("DA\t\t \t= "+DA);
System.out.println("Petrol Allowance\t= "+petrol_allowance);
System.out.println("Tax Deduction \t\t= "+tax_deduction);
System.out.println("Gross Salary\t\t= "+gross_salary);
}
}