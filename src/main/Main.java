package main;

import builders.BookBuilder;
import builders.BookDedicationBuilder;
import data.Book;
import data.BookDedication;
import directors.BookDirector;

public class Main {
    public static void main(String[] args) {
        BookDirector bookDirector = new BookDirector();

        BookBuilder builder = new BookBuilder();
        bookDirector.addBook(builder);
        Book book = builder.getResult();
        System.out.println("Livro:\n" + book.getType() + "\n");

        BookDedicationBuilder bookDedicationBuilder = new BookDedicationBuilder();
        bookDirector.addEBook(bookDedicationBuilder);
        BookDedication bookDedication = bookDedicationBuilder.getResult();
        System.out.println("Dedicatória do livro:\n" + bookDedication.print() + "\n");
    }
}
