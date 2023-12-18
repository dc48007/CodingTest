package com.internal.Archieved.designPattern.factoryDesign.example2;
import java.lang.reflect.InvocationTargetException;

public class LoggerFactory {

    public static Logger loggerfactory(Class<? extends Logger> loggerclass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
     return    loggerclass.getDeclaredConstructor().newInstance();
        /*if (logtype.equalsIgnoreCase("Console")){
            return new ConsoleLogger();
        }else if (logtype.equalsIgnoreCase("Database")){
            return new DatabaseLogger();
        }else
            throw new IllegalArgumentException("----------------Invalid logtype--------------------------");*/
    }
}
