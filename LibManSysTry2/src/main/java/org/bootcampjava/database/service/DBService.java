package org.bootcampjava.database.service;

import org.bootcampjava.entities.Book;
import org.bootcampjava.entities.Staff;
import org.bootcampjava.entities.User;
import org.bootcampjava.log.service.BaseLogger;
import org.bootcampjava.log.service.DatabaseLogger;

public class DBService implements DataBase{
    DatabaseLogger log=new DatabaseLogger();
    @Override
    public void dbBook(Book book) {
        bookList.add(book);
        System.out.println("İndeks: "+bookList.indexOf(book));
        log.logBase("Kitap veritabanına işlenmiştir");


    }

    @Override
    public void dbUser(User user) {
        userList.add(user);
        System.out.println("İndeks: "+userList.indexOf(user));
        log.logBase("Kullanıcı veritabanına işlenmiştir");
    }

    @Override
    public void dbStaff(Staff staff) {
        staffList.add(staff);
        System.out.println("İndeks: "+staffList.indexOf(staff));
        log.logBase("Çalışan veri tabanına işlenmiştir");
    }
}
