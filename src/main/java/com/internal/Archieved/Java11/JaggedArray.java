package com.internal.Archieved.Java11;

public class JaggedArray {

   public   static void main(String[] args) {

       int [][] jaggedArray = new int[5][];

       jaggedArray[0] = new int[1];
       jaggedArray[1] = new int[2];
       jaggedArray[2]= new int[3];
       jaggedArray[3]= new int[4];
       jaggedArray[4]= new int[5];


       //adding elements
       for (int i = 0; i < jaggedArray.length; i++) {
           for (int j = 0; j < jaggedArray[i].length; j++) {
               jaggedArray[i][j]=(i+1)*(j+1);
           }

       }
       for (int i = 0; i < jaggedArray.length; i++) {
           for (int j = 0; j < jaggedArray[i].length; j++) {
               System.out.print(jaggedArray[i][j] + " ");

           }
           System.out.println();
       }

    }
}
