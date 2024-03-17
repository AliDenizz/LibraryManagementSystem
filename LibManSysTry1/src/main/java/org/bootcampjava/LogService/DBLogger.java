package org.bootcampjava.LogService;

public class DBLogger extends BaseLogger{
    @Override
    public void log(String message){

        System.out.println(message+" Logged to DataBase.");
    }
}
