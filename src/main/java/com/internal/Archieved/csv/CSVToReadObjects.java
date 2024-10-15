package com.internal.Archieved.csv;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVToReadObjects {

    public static void main(String[] args) {
        String csvFilePath = "C:\\Users\\deepakc\\Desktop\\Perosn.csv"; // Replace with actual file path
        try (FileReader reader = new FileReader(csvFilePath)) {
            CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader).withType(Person.class).withIgnoreLeadingWhiteSpace(true).build();
            List<Person> persons = csvToBean.parse();
            System.out.println(persons.size());
            for (Person person : persons) {
                System.out.println(person.getName() +"---"+ person.getAge() +"--"+ person.getEmail());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
