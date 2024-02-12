package com.internal.Archieved.Practise.Overloading;
public class ProgramOverloading {

    public void display() {
        System.out.println("display without args");
    }

    public void display(int num){
        System.out.println("Display with one args: "+num);
    }

    public void display(long num){
        System.out.println("Display with one args: "+num);
    }

    public void display(long num, String s){
        System.out.println("Display 2 args: "+num+", "+ s);
    }

    public void display(String s1, String s){
        System.out.println("Display 2 args: "+s1+", "+ s);
    }

    public void display(int num, String s){
        System.out.println("Display 2 args: "+num+", "+ s);
    }

}
