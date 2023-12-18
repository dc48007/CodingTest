package com.internal.Archieved.Practise.Inheritance;
public class SuperClass {
   private int bigMuscle;
   private int bigResponsility;
   String name;
   public void display(){
       System.out.println("Super value is: "+ name);
   }
    public int get() {
        return bigMuscle + bigResponsility;
    }

public SuperClass(){

}
    public SuperClass(int bigMuscle, int bigResponsility){
        this.bigMuscle =bigMuscle;
        this.bigResponsility = bigResponsility;
    }
}
