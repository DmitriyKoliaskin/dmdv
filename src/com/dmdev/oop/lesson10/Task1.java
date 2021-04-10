package com.dmdev.oop.lesson10;

public class Task1 {
    public static void main(String[] args) {
        String value = "afafsfas :( asfasf :( aff :) asfaf :) fasfasf :(";
        String replace = replace(value);
        System.out.println(replace);
    }
    public static String replace(String value) {
        return value.replace(":(", ":)");
    }
}
