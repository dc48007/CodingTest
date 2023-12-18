package com.internal.Archieved.designPattern.proxyPattern;
public class mainClass {
    public static void main(String[] args) {
        Image image  = new ImageProxy("deepak.jpg");
        image.display();
        image.display();
    }
}
