package org.bootcampjava.Entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ReturnBookService {
    public void returning(User user, Books books, Staff staff, BorrowBook borrowBook) {
        System.out.println(books.getName() + " isimli kitap, " + user.getName() +
                " isimli kullanıcı tarafından iade edilmiştir. Iade alan: " + staff.getName());
        books.setBorrowed(false);

        LocalDate returnDate = LocalDate.now(); // İade tarihi
        long difference = ChronoUnit.DAYS.between( borrowBook.getBorrowDate(),
                returnDate.plusDays(6)); // Ödünç alma ve iade tarihleri arasındaki fark

        if (difference > 5) {
            System.out.println("Kitap teslim tarihini aştınız.");
        }
    }
}
