package org.bootcampjava.Entities;

public class Books {
    private int bookId;
    private String name;
    private boolean borrowed;
    public Books(int bookId, String name) {
        this.bookId = bookId;
        this.name = name;
        this.borrowed=false;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
