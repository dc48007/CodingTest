package com.internal.Archieved.Practise.Overloading;
import java.sql.SQLOutput;

public class ProgramOverriding extends ProgramOverloading{


    public void display(){
        System.out.println("Overridden method: ");
    }
    public static void main(String[] args) {
        ProgramOverloading programOverloading = new ProgramOverriding();
        ProgramOverriding programOverriding= new ProgramOverriding();
        ProgramOverloading programOverloading1 =  new ProgramOverloading();
        programOverriding.display();
        programOverloading.display();
        programOverloading1.display();
    }

}
