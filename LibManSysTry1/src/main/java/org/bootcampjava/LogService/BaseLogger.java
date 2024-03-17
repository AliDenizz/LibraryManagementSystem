package org.bootcampjava.LogService;

public abstract class BaseLogger implements Logger{


    public void logBase(String message){

        System.out.println("Log is started!");
        log(message);
        System.out.println("Log is ended!");
    }
}
