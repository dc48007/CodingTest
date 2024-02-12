package com.internal.Archieved.Practise.SeleniumPractise;
public class CurrencyEntity {

    public String currencyName;
    public String currencyValue;
    public String currencyChange;
    public String currencyNetChange;

    public CurrencyEntity(String cv, String cc, String cnc){
        this.currencyValue =cv;
        this.currencyChange =cc;
        this.currencyNetChange =cnc;
    }



}
