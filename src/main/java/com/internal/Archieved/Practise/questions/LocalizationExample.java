package com.internal.Archieved.Practise.questions;

import java.util.Locale;

public class LocalizationExample {

    public static void main(String[] args) {
        var Enus = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(Enus.getDisplayCountry(new Locale("us")));
    }
}
