package com.internal.Archieved.functionalInterface.supplierInterface;
import java.math.BigDecimal;
import java.util.function.Supplier;

/**
 * Class demonstrates the use case of supplier interface
 * Creating developer object using factory method
 */
public class PractiseSupplier {

    public static void main(String[] args) {
        Developer developer = factory(Developer::new);
        System.out.println(developer.getName() + "------" + developer.salary);
        Developer developer1 = factory(() -> new Developer("Deepak"));
        System.out.println(developer1.salary + "====" + developer1.getName());
    }

    public static Developer factory(Supplier<? extends Developer> dev) {
        Developer developer = dev.get();
        if (developer.getName() == null || developer.getName().equals("")) {
            developer = new Developer("Default");
        }
        developer.salary = BigDecimal.valueOf(10000);
        return developer;
    }
}
