package com.ashish.javacourse.lesson3;

public enum LoggingLevel {

    PENDING(1), PROCESSING(2), PROCESSED(3);

    private int i;
    LoggingLevel(int i){
        this.i = i;
    }

    public int code(){
        return i;
    }
}
