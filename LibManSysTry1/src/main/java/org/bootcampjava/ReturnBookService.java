package org.bootcampjava;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;

public class ReturnBookService {
    public void returning(User user, Books books, Staff staff, LocalDate borrowDate) {
        System.out.println(books.getName() + " isimli kitap, " + user.getName() +
                " isimli kullanıcı tarafından iade edilmiştir. Iade alan: " + staff.getName());
        books.setBorrowed(false);

        LocalDate returnDate = LocalDate.now(); // İade tarihi
        long difference = ChronoUnit.DAYS.between((Temporal) borrowDate, returnDate.plusDays(10)); // Ödünç alma ve iade tarihleri arasındaki fark

        if (difference > 5) {
            System.out.println("Kitap teslim tarihini aştınız.");
        }
    }
}
