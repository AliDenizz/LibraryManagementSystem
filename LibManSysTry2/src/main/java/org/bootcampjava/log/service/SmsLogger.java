package org.bootcampjava.log.service;

public class SmsLogger extends BaseLogger{

    @Override
    public void Logger(String message) {

        System.out.println(message+ " logged to SMS service.");

    }
}
