public class Cel_To_Far{

public static void main(String args[])
{
double cel =33.987;
System.out.println("the temprature entered in degree celsius is "+cel);
double far=0;
far= ((cel*9)/5)+32;
cel=((far-32)*5)/9;
System.out.println("the temprature after conversion to fahrenhiet is "+far);
System.out.println("the temprature after conversion to degree is "+cel);
}
}