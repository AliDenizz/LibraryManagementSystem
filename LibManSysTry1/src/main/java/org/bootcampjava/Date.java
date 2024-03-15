package org.bootcampjava;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class Date {
    private LocalDate date1;

    public Date(LocalDate date1) {
        this.date1 = date1;
    }

    public LocalDate getDate1() {
        return date1;
    }

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }
}
