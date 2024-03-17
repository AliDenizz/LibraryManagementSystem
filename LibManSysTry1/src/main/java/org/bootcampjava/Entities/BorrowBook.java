package org.bootcampjava.Entities;

import java.time.LocalDate;

public class BorrowBook {
    private LocalDate borrowDate;

    public void borrowing(User user, Books books){


        if (books.isBorrowed()==true){
            System.out.println("Kitap zaten ödünç alınmıştır.");

        }else{
            books.setBorrowed(true);
            setBorrowDate(LocalDate.now());
            System.out.println("Kitabı 15 gün içerisinde iade ediniz.");
        }


    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }
}
