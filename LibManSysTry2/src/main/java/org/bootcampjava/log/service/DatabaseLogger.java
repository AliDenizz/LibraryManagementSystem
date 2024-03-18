package org.bootcampjava.log.service;

public class DatabaseLogger extends BaseLogger{

    @Override
    public void Logger(String message) {
        System.out.println(message+ " logged to DataBase service.");
    }
}
