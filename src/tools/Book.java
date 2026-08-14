package tools;

public class Book {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;
    public Book(String title, String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=true;


    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void checkOut(){
        if (isAvailable){
            isAvailable=false;
            System.out.println(title+" checked out successfully");
        }else{
            System.out.println(title+" already checekd out");
        }
    }

    public void returnBook(){
        if(!isAvailable){
            isAvailable=true;
            System.out.println(title+" Book returned successfully");
        }else {
            System.out.println(title+" This book was not checked out ");
        }
    }
public boolean isPricerThan(Book other){
        return this.price>other.getPrice();
}

    public void show(){
        System.out.println("..............Book Information.........");
        System.out.println("Title:" +getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Price: "+getPrice());
        System.out.println("Available: "+isAvailable());

    }
}
