package org.bootcampjava;


import org.bootcampjava.Entities.*;

public class Main {
    public static void main(String[] args) {
        Staff staff1=new Staff(1, "Ali");
        Books book1= new Books(1, "Kitap1");
        User user1= new User(1, "USer1");

        BorrowBook borrowBook1= new BorrowBook();
        borrowBook1.borrowing(user1, book1);

        ReturnBookService returnBook= new ReturnBookService();
        returnBook.returning(user1, book1, staff1, borrowBook1);



    }
}
