package com.dmdev.oop.lesson11;

import com.dmdev.oop.lesson7.Ram;
import com.dmdev.oop.lesson7.Ssd;

public class OopLessonRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(250), new Ram(1024));
        Laptop laptop1 = new Laptop(new Ssd(5000), new Ram(10000), 5);

        printComputers(new Computer[] {laptop, mobile, laptop1});

    }

    public static void printComputers(Computer[] computers) {
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                ((Laptop) computer).open();
            }
            computer.print();
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers) {
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}

