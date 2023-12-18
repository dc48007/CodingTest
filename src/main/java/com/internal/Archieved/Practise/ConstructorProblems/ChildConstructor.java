package com.internal.Archieved.Practise.ConstructorProblems;

public class ChildConstructor  extends ProgramConstructor{

    public ChildConstructor(){
        i--;
        System.out.println("Child constructor");
        System.out.println("Value of i: "+ i);
    }

    public static void main(String[] args) {
        new ChildConstructor();
    }
}
