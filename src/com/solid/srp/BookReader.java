package com.solid.srp;

import com.solid.srp.entity.Author;
import com.solid.srp.entity.Book;

/**
 * Single-Responsibility Principle
 * A module should be responsible to one, and only one, actor.
 * -------
 * The task is to refactor a given code to comply with Single-Responsibility Principle.
 */
public class BookReader {
    private Book book;
    private int currentPage;

    public BookReader(Book book) {
        this.book = book;
        this.currentPage = 0;
    }

    public void turnPage() {
        currentPage++;
    }

    public boolean isLastPage() {
        return currentPage == book.getPagesNumber();
    }

    public void printCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }

    public static void main(String[] args) {
        Book book = new Book("SOLID",
                new Author("Stemmler, Khalil"),
                352);

        BookReader reader = new BookReader(book);

        while (!reader.isLastPage()) {
            reader.turnPage();
            reader.printCurrentPage();
        }

        System.out.println("Congratulations, you have read the book.");
    }
}
