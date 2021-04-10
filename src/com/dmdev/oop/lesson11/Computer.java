package com.dmdev.oop.lesson11;

import com.dmdev.oop.lesson7.Ram;
import com.dmdev.oop.lesson7.Ssd;

public class Computer implements Printable {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("Я загрузился");
    }

    @Override
    public void print() {
        System.out.println("Ssd: " + ssd.getValue() + ", Ram: " + ram.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}
