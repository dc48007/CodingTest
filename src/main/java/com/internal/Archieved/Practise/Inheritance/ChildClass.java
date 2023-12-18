package com.internal.Archieved.Practise.Inheritance;
public class ChildClass extends SuperClass {


    public ChildClass(){
    }
    public void display() {
        System.out.println("child value is: " + name);
    }

    public static void main(String[] args) {
        SuperClass c1 = new SuperClass(1, 2);
        System.out.println(c1.get());
        c1.name = "Ram";
        c1.display();
        SuperClass superClass = new ChildClass();
        superClass.name = "Shaam";
        superClass.display();
    }
}
