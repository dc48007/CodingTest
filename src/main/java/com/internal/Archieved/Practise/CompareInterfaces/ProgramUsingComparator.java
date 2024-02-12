package com.internal.Archieved.Practise.CompareInterfaces;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProgramUsingComparator{
    public static void main(String[] args) {
        Student s1 =new Student(3, "anurag");
        Student s2 =new Student(9, "aarav");
        Student s3 =new Student(12, "ajay");
        Student[] students = {s1,s2,s3};
       // Arrays.sort(students, studentComparator);
        Arrays.sort(students, Comparator.comparing(Student::getName));
        String str =Arrays.stream(students).map(Student::getName).collect(Collectors.joining(" "));
        System.out.println(str);

    }
}
