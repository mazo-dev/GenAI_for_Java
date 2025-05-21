package com.dev.utils;

public class Helper {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
        
        //Purposely introuced null pointer exception
        String s = null;
        System.out.println("Display S="+s.toLowerCase());
    }
}