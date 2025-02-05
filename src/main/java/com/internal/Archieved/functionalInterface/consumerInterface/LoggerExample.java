package com.internal.Archieved.functionalInterface.consumerInterface;

import java.util.function.Consumer;

public class LoggerExample {
    private Consumer<String> logAction;

    public LoggerExample(Consumer<String> logAction){
        this.logAction = logAction;
    }
    public void logAction(String message){
        logAction.accept(message);
    }

    public static LoggerExample infoLogger(){
        return new LoggerExample(message -> System.out.println("[INFO]: "+message));
    }

    public static LoggerExample errorLogger(){
        return  new LoggerExample(message-> System.err.println("[ERROR]: "+message));
    }



    public static void main(String[] args) {
        LoggerExample infoLogger = LoggerExample.infoLogger();
        infoLogger.logAction("This is info logger");
        LoggerExample errorLogger = LoggerExample.errorLogger();
        errorLogger.logAction("here error is logged !");
    }
}
