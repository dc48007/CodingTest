package com.internal.Archieved.Practise.io;

import com.internal.Archieved.Practise.annotation.ConfigData;

import java.io.*;

public class FileInputExample {

    @ConfigData(path="C:\\Users\\deepakc\\Videos\\IP_address.txt") static String path;

    public static void main(String[] args) throws FileNotFoundException {

        try(BufferedReader fileInputStream =  new BufferedReader(new FileReader(path))){
        StringBuilder content = new StringBuilder();
        String line;
            while((line = fileInputStream.readLine())!= null){
                content.append(line).append(System.lineSeparator());
            }
            System.out.println(content.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
