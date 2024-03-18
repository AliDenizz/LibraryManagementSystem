package org.bootcampjava;

import org.bootcampjava.entities.Book;
import org.bootcampjava.entities.Staff;
import org.bootcampjava.entities.User;
import org.bootcampjava.work.BorrowBook;
import org.bootcampjava.work.ReturnBook;

public class Main {
    public static void main(String[] args) {

        Book book1=new Book("Kitap1", 0001);
        Staff staff1=new Staff("Staff1", 0001,"5515511551");
        User user1=new User(0001, "User1", "525451523");
        BorrowBook borrowBook=new BorrowBook();
        borrowBook.borrowBook(user1, book1);
        ReturnBook returnBook=new ReturnBook();
        //returnBook.returnBook(user1, book1, staff1);
        User user2=new User(0002, "User2", "4546452222");
        BorrowBook borrowBook1=new BorrowBook();
        borrowBook1.borrowBook(user2, book1);
        Book book2=new Book("Kitap2", 0002);

    }
}