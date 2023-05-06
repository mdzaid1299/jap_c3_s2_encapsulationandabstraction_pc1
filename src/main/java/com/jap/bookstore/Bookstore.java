package com.jap.bookstore;

import java.util.Objects;

public class Bookstore {
    String bookStoreName;
    String bookStoreRegistrationId;
    Book[] books;

    // Declare a parameterized constructor to initialize values
    public Bookstore(String bookStoreName, String bookStoreRegistrationId, Book[] books) {
        this.books = books;
        this.bookStoreName = bookStoreName;
        this.bookStoreRegistrationId = bookStoreRegistrationId;
    }

    public Bookstore() {

    }
    // Function to calculate the discount for a genre of books
    public float calculateDiscount(Book book, float discountPercentage) {
        float dis = book.price - (book.price * discountPercentage )/100;
        // if (Objects.equals(book.genre, "FICTION")) {
        //     return dis;
        // } else {
        //     return book.price;
        // }
        if(book.genre.equals("FICTION")){
            return dis;
             } else {
                 return book.price;
             }
        }

    }
