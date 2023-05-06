package com.jap.bookstore;

public class BookStoreImpl {
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects
        Author author = new Author("kaliso", "fasilo");
        Book book = new Book(76, "hijab",author, "FICTION", 17.8f);
        Book[] books = new Book[]{book};
        //Bookstore bookStore = new Bookstore("Hamid book depo", "7653423", books);
        Bookstore bookstore = new Bookstore();
        //Display book details before discount is calculated
        System.out.println("The book details before discount : " +book.price);
        System.out.println(book.displayBookDetails());
        //Calculate discount on the books by calling the methods
        float store = bookstore.calculateDiscount(book, 5.6f);
        //Display book details after discount is calculated
        System.out.println("The book details after discount : "+ store);

    }

}
