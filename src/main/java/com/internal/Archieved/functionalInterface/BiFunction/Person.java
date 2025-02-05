package com.internal.Archieved.functionalInterface.BiFunction;

import java.util.function.BiFunction;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age){
        this.age =age;
        this.name=name;
    }

    public String toString(){
       return "Person{ name: "+name + " and Person age: "+ age+" }";
    }

    public static void main(String[] args) {
        BiFunction<String, Integer, Person> personBiFunction = (str, i)->new Person(str,i);
        Person person = personBiFunction.apply("Deepak",33);
        System.out.println(person);
    }
}
