package com.dmdev.oop.lesson10;

public class Task2 {
    public static void main(String[] args) {
        String value = "123 3 dasfsd  123";
        String word = "123";
        System.out.println(isStartAndEnd(value, word));
    }
    private static boolean isStartAndEnd(String target, String word) {
        return target.startsWith(word) && target.endsWith(word);
    }
}
