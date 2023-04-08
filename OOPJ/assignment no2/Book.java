 import java.util.*;
 class BOOK12{
private String Title;
private String Author;
private String publisher;
private String ISBN;
private int year;
private double price;
private int quantity;

BOOK12(){
this.Title="Programming in Java";
this.Author="Vikram";
this.publisher="Vikram Publications";
this.ISBN="12-34-56-7";
this.year=2000;
this.price=500;
this.quantity=1000;
}
BOOK12(String Title,String Author,String publisher,String ISBN,int year,double price,int quantity){
    this.Title=Title;
    this.Author=Author;
    this.publisher=publisher;
    this.ISBN=ISBN;
    this.year=year;
    this.price=price;
    this.quantity=quantity;
}
public String getTitle() {
    return Title;
}
public void setTitle(String title) {
    Title = title;
}
public String getAuthor() {
    return Author;
}
public void setAuthor(String author) {
    Author = author;
}
public String getPublisher() {
    return publisher;
}
public void setPublisher(String publisher) {
    this.publisher = publisher;
}
public String getISBN() {
    return ISBN;
}
public void setISBN(String iSBN) {
    ISBN = iSBN;
}
public int getYear() {
    return year;
}
public void setYear(int year) {
    this.year = year;
}
public double getPrice() {
    return price;
}
public void setPrice(double price) {
    this.price = price;
}
public int getQuantity() {
    return quantity;
}
public void setQuantity(int quantity) {
    this.quantity = quantity;
}

void increaseQuantity(int quantity){
this.quantity+=quantity;

}
void decreaseQuantity(int quantity){
    this.quantity-=quantity;
}
double getInventoryValue(){
    return this.quantity*this.price;

}


}
public class Book {
    public static void main(String[] args) {

        BOOK12 b1=new BOOK12();
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your choice 1.Add Books 2.Remove Books");
        int choice =sc.nextInt();
        if(choice==2)
        {System.out.print("How many books to remove :");
        int num=sc.nextInt();
            b1.decreaseQuantity(num);

        }
        else if (choice==1)
        {System.out.print("How many books to add :");
        int num=sc.nextInt();
            b1.increaseQuantity(num);
        }

        
        double value=b1.getInventoryValue();
        
        System.out.println("The total no of "+b1.getTitle()+" books are + "+b1.getQuantity());
        System.out.println("The Total cost of inventory is "+value);
    }
    
}
