package org.bootcampjava.database.service;

import org.bootcampjava.entities.Book;
import org.bootcampjava.entities.Staff;
import org.bootcampjava.entities.User;

import java.util.ArrayList;
import java.util.List;

public interface DataBase {
    List<User> userList=new ArrayList<>();
    List<Staff> staffList= new ArrayList<>();
    List<Book> bookList= new ArrayList<>();
    void dbBook(Book book);
    void dbUser(User user);
    void dbStaff(Staff staff);
}
