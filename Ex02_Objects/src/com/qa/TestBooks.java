package com.qa;

import java.util.ArrayList;

public class TestBooks {
    public static void main(String[] args) {
        Book book1 = new Book("Book1", "Author1", 10);
        Book book2 = new Book("Book2", "Author2", 20);
        Book book3 = new Book("Book3", "Author3", 30);
        Book book4 = new Book("Book4", "Author4", 40);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        for( Book b : books) {
            System.out.println(b);
        }
    }
}
