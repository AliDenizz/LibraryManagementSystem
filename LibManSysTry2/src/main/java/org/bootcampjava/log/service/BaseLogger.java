package org.bootcampjava.log.service;

public abstract class BaseLogger implements LogService{
    public void logBase(String message) {
        System.out.println("Log process has been started.");
        Logger(message);
        System.out.println("Log process has been done.");

    }
}
