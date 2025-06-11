package com.internal.zo829;

public class StringPoolPractise {
    public static void main(String[] args) {
        new StringPoolPractise().StringConcat();
        new StringPoolPractise().deleteAndInsert();
    }



    void StringConcat(){
        String s1 = "ab";
        String s2 = "a"+"b";
        System.out.println(s1==s2);  //true
        String s3 = "a";
        s3 =s3 + "b";
        System.out.println(s1==s3);
    }


    void notEfficient() {
        //This sequence of events continues, and after 26 iterations through the loop,
        // a total of 27 objects are instantiated,
        // most of which are immediately eligible for garbage collection.
        String target = "";
        for (char c = 'a'; c <= 'z'; c++) {
            target += c;
        }
        //abcdefghijklmnopqrstuvwxyz
        System.out.println(target);
    }

    void withStringBuilder() {
        //this doesn't create intermediate string(s)
        StringBuilder target = new StringBuilder();
        for (char c = 'a'; c <= 'z'; c++) {
            target.append(c);
        }
        //abcdefghijklmnopqrstuvwxyz
        System.out.println(target);
    }
//demonstrating delete and insert methods
    void deleteAndInsert(){
        StringBuilder stringBuilder =  new StringBuilder("Animals");
        stringBuilder.insert(5, "in");
        System.out.println("StringBuilder value: "+stringBuilder);
        stringBuilder.delete(5,7);
        System.out.println("StringBuilder value: "+stringBuilder);
    }

}
