package com.internal.Archieved.csv;
import com.opencsv.bean.CsvBindByName;

public class Person {
    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Age")
    private int age;

    @CsvBindByName(column = "Email")
    private String email;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // Getters and setters (omitted for brevity)


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

}
