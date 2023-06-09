package designPattern.factoryDesign.example2;
import java.lang.reflect.InvocationTargetException;

public class ClientClass {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        ConsoleLogger consoleLogger = (ConsoleLogger) LoggerFactory.loggerfactory(ConsoleLogger.class);
        consoleLogger.log();
        DatabaseLogger databaseLogger = (DatabaseLogger) LoggerFactory.loggerfactory(DatabaseLogger.class);
        databaseLogger.log();
    }
}
