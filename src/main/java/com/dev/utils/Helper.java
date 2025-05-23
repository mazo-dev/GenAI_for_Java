package com.dev.utils;

public class Helper {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");

        //Purposely introduced null pointer exception
        name = null;
        System.out.println("Display S="+name.toLowerCase());
    }
}