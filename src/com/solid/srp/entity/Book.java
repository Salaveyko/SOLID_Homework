package com.solid.srp.entity;

public class Book {
    private String title;
    private Author author;
    private int pagesNumber;

    public Book(String title, Author author, int pagesNumber) {
        this.title = title;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorsName() {
        return author.getName();
    }

    public void setAuthorsName(String authorsName) {
        this.author.setName(authorsName);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public String toString() {
        return "Book {\n title = '" + title
                + "',\n author = " + author
                + "\n}";
    }
}
