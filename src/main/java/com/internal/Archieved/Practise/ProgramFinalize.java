package com.internal.Archieved.Practise;
public class ProgramFinalize {

    public void finalize(){
        System.out.println("finalize method printed");
    }

    public String toString(){
        System.out.println("string wala method");
        return "meraa nama";
    }

    public static void main(String[] args) {
        ProgramFinalize programFinalize1 = new ProgramFinalize();
        ProgramFinalize programFinalize2 = new ProgramFinalize();

        programFinalize2.toString();
        programFinalize2.finalize();
        programFinalize1 = null;
        programFinalize2= null;
        System.gc();

    }
}
