package com.jap.bookstore;

public class BookStoreImpl {
    public static void main(String[] args) {
        // Declare and initialize author, book and bookstore objects
            Author author = new Author();
            Bookstore bookStore = new bookstore();
            Book book = new Book();
        //Display book details before discount is calculated
        System.out.println("The book details before discount : ");
        System.out.println(book.displayBookDetails())
        //Calculate discount on the books by calling the methods
        bookstore.calculateDiscount()
        //Display book details after discount is calculated
        System.out.println("The book details after discount : ");
        
        }

}
