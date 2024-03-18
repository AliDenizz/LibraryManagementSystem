package org.bootcampjava.work;

import org.bootcampjava.entities.Book;
import org.bootcampjava.entities.Staff;
import org.bootcampjava.entities.User;

public interface BookProcess {
    void borrowBook(User user, Book book);

    void returnBook(User user, Book book, Staff staff);
}
