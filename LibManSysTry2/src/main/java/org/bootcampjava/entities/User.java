package org.bootcampjava.entities;

import org.bootcampjava.database.service.DBService;

import java.time.LocalDate;

public class User{
    private boolean hasBook;
    private int id;
    private String name;
    private String phoneNumber;
    private LocalDate borrowDate;


    public User(int id, String name, String phoneNumber) {
        this.hasBook = false;
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.borrowDate=null;
        System.out.println(getName()+" isimli kullanıcı sisteme eklenmiştir.");
        DBService dbSaving=new DBService();
        dbSaving.dbUser(this);
    }


    public boolean isHasBook() {
        return hasBook;
    }

    public void setHasBook(boolean hasBook) {
        this.hasBook = hasBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }
}
