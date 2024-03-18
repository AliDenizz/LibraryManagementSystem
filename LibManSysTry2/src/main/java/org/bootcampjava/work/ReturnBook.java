package org.bootcampjava.work;

import org.bootcampjava.entities.Book;
import org.bootcampjava.entities.Staff;
import org.bootcampjava.entities.User;
import org.bootcampjava.log.service.SmsLogger;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReturnBook implements BookProcess{
    SmsLogger log=new SmsLogger();


    @Override
    public void borrowBook(User user, Book book) {

    }

    @Override
    public void returnBook(User user, Book book, Staff staff) {
        System.out.println(book.getBookName()+" adlı kitap "+user.getName()+
                " adlı kullanıcı tarafından teslim edilmiştir.");
        book.setBorrowed(false);
        user.setHasBook(false);
        log.logBase("İade işlemi");
        LocalDate returnDate=LocalDate.now();
        long difference= ChronoUnit.DAYS.between(user.getBorrowDate(), returnDate.plusDays(16));
        if (difference>15){
            System.out.println("Kitap teslim tarihini aştınız.");
            log.logBase("İade cezası");
        }

    }
}
