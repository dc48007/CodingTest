package com.internal.Archieved.Practise.questions;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class IOExample {

    public static void main(String[] args) throws IOException {
        var lines = new ArrayList<>();
       var content =  Files.lines(Paths.get("myfile.txt"), Charset.defaultCharset());
       content.map(String::trim).filter(s->!s.isEmpty()).forEach(lines::add);
        System.out.println(lines);
    }
}
