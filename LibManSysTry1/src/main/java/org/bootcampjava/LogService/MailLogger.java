package org.bootcampjava.LogService;

public class MailLogger extends BaseLogger{
    @Override
    public void log(String message){
        System.out.println(message+ " Logged to mail address.");
    }
}
