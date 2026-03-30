package Oops;

public class Book {
	String title, author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Book b = new Book("Java", "James", 499);
        System.out.println(b.title + " " + b.author + " " + b.price);
    }
}
