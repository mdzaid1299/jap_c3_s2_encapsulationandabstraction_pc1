package com.jap.bookstore;

public class Book {
    int ISBNNo;
    String bookName;
    Author author;
    String genre;
    float price;


    // Declare a parameterized constructor to initialize values
    public Book(int ISBNNo, String bookName, Author author, String genre, float price) {
        this.ISBNNo = ISBNNo;
        this.author =author;
        this.bookName = bookName;
        this.genre = genre;
        this.price = price;
    }

    // Method to display the details of a book
    public String displayBookDetails()
    {
        return (ISBNNo +"::" + bookName + "::"+ author.authorName+"::"+genre+":: " + "$" +price);
    }


}
