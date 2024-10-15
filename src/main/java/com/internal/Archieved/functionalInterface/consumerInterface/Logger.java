package com.internal.Archieved.functionalInterface.consumerInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Logger {
    private List<Consumer<String>> logConsumers = new ArrayList<>();

    public void addInfo(Consumer<String> consumer) {
        logConsumers.add(consumer);
    }

    public void log(String message) {
        logConsumers.forEach(d -> d.accept(message));
    }

    public static void main(String[] args) {

        // Usage
        Logger logger = new Logger();
        logger.addInfo((add)-> System.out.println(add));
        logger.log("Log message");
        logger.log("Deepak is my connection");
    }
}


