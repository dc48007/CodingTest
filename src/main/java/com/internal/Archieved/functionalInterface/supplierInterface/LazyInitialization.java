package com.internal.Archieved.functionalInterface.supplierInterface;

import java.util.function.Supplier;

public class LazyInitialization {

    private Supplier<String> stringSupplier ;
    private String cacheValue;

    public LazyInitialization(){

        stringSupplier = ()->{
            if(cacheValue==null){
                cacheValue = initializeValue();
            }
            return cacheValue;
        };
    }
    public String getValue(){
        return stringSupplier.get();
    }
    public String initializeValue(){
        return "perform expensie operation";
    }

    public static void main(String[] args) {
        LazyInitialization lazyInitialization =new LazyInitialization();
        System.out.println("before calling: "+lazyInitialization.getValue());
        System.out.println("After calling: "+ lazyInitialization.getValue());

    }

}
