package com.internal.zo829;

import java.time.DayOfWeek;

public class SwitchCaseExpressionPractise {

    public static void main(String[] args) {

        new SwitchCaseExpressionPractise().swtichWithoutReturnCase();
        new SwitchCaseExpressionPractise().printItalianDayWithDefault(DayOfWeek.MONDAY);
        new SwitchCaseExpressionPractise().switchWithYield(19);
        new SwitchCaseExpressionPractise().multipleCasesWithDefault();
        new SwitchCaseExpressionPractise().switchCaseWithYieldScenario(6);
    }

    public void swtichWithoutReturnCase() {
        int cnt = 0;
        char c = 'a';
        //there is no return value assigned so the default is not needed!
        switch (c) {
            case 'a' -> cnt++;
            case 'b' -> cnt++;
        }
        System.out.println(cnt); //1
    }
//
//    Switch supported types
//    int,byte, short, char
//            Integer, Byte, Short, Character
//    enum
//    String
//var (if type was previously resolved)

    void printItalianDayWithDefault(DayOfWeek day) {
        var result = switch (day) {
            case MONDAY -> "lunedi";
            case TUESDAY -> "martedi";
            case WEDNESDAY -> "mercoledi";
            case THURSDAY -> "giovedi";
            case FRIDAY -> "venerdi";
            default -> "weekend";
        };

        System.out.println(result);
    }

    //switch expression with Yield
    //if switch expression returns value then defualt is required and each branch
    // inside the default block must yield a value

    void switchWithYield(int number){
        var result = switch(number){
            case 0 -> "you're just born";
            default ->{

                if(number >5 && number <18){
                    yield "you are under adult";
                }else if(number >20){
                    yield "you are adult !";
                }else{
                    yield "you're kid";
                }
            }
        };
        System.out.println(result);
    }

    void multipleCasesWithDefault(){
        int x = 10;
        switch (x){
            case 2, 3:
                System.out.println("2,3");
               case 7:
                default:
                System.out.println("Defualt");
                case 8, 9:
                System.out.println("after default");
        }
    }
    void switchCaseWithYieldScenario(int x){
       var value =  switch (x){
            case 2, 4 -> "even number";
           default -> {
               yield "default case";
           }
           case 1,3 -> "odd number";
       }  ;
        System.out.println(value);
    }
}
