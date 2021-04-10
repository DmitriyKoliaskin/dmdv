package com.dmdev.oop.lesson11;

import com.dmdev.oop.lesson7.Ram;
import com.dmdev.oop.lesson7.Ssd;

public class OopLessonRunner2 {
    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(2510), new Ram(11024));

//        print(laptop, mobile);
        printWithRandom(laptop, mobile);
    }
    public static void print(Printable... objects) {
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }
    public static void printWithRandom(Printable... objects) {
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }
}
