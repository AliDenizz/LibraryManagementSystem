package org.bootcampjava.entities;

import org.bootcampjava.database.service.DBService;
import org.bootcampjava.database.service.DataBase;

public class Book {
    private String bookName;
    private int bookId;
    private boolean borrowed;

    public Book(String bookName, int bookId) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.borrowed = false;
        System.out.println(getBookName()+" adlı kitap kütüphaneye eklenmiştir.");
        DBService dbSaving=new DBService();
        dbSaving.dbBook(this);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }
}
