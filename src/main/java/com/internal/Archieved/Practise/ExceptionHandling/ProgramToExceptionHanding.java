package com.internal.Archieved.Practise.ExceptionHandling;
import java.util.TreeSet;

public class ProgramToExceptionHanding {



    public static void main(String[] args) {

        try{
           // int result =10/0 ;
            TreeSet<Integer> treeSet = new TreeSet<>();
            treeSet.add(null);

        } catch (ArithmeticException e1){
            System.out.println(e1.getMessage());
        }catch (RuntimeException r){
            System.out.println(r.fillInStackTrace());
        }
        catch (Exception e){
            throw new RuntimeException("EXceptio occured", e.fillInStackTrace());
        }
    }
}
