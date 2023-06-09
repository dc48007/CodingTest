package functionalInterface.supplierInterface;
import java.math.BigDecimal;

public class Developer {
    private String name;
    BigDecimal salary;

    public Developer(String name){
         this.name = name;
    }
    public Developer(){

    }
    public String getName() {
        return name;
    }


}
