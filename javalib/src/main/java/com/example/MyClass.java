package com.example;

import java.util.ArrayList;
import java.util.Random;

public class MyClass {
    private static Random randomGenerator = new Random();
    private static ArrayList<String> jokes2 = new ArrayList<>();

    public static String getJoke(){
        if(jokes2.size() == 0) {
            jokes2.add("Knock, knock\n" +
                    "Who’s there?\n" +
                    "Merry.\n" +
                    "Merry who?\n" +
                    "Merry Christmas!");
            jokes2.add("Knock, knock\n" +
                    "Who’s there?\n" +
                    "Iva.\n" +
                    "Iva who?\n" +
                    "I’ve a sore hand from knocking!");
        }
        return jokes2.get(randomGenerator.nextInt(jokes2.size()));
    }
}
