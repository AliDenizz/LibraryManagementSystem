package org.bootcampjava.work;

import org.bootcampjava.entities.Book;
import org.bootcampjava.entities.Staff;
import org.bootcampjava.entities.User;
import org.bootcampjava.log.service.BaseLogger;
import org.bootcampjava.log.service.SmsLogger;

import java.time.LocalDate;

public class BorrowBook implements BookProcess{
    SmsLogger log=new SmsLogger();

    @Override
    public void borrowBook(User user, Book book){
        if(book.isBorrowed()==true || user.isHasBook()==true){
            if (book.isBorrowed()==true){
                System.out.println("Kitap daha önce ödünç alınmıştır.");
                log.logBase("Ödünç alma hatası");
            }else {
                System.out.println("Başka bir kitap alamazsınız.");
                log.logBase("Ödünç alma hatası");
            }
        }else {
            System.out.println("Kitabı 15 gün içerisinde geri getiriniz.");
            book.setBorrowed(true);
            user.setHasBook(true);
            user.setBorrowDate(LocalDate.now());
            log.logBase("Ödünç alma işlemi");
        }


    }

    @Override
    public void returnBook(User user, Book book, Staff staff) {

    }


}
