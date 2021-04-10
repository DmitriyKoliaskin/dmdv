package com.dmdev.oop.lesson11;

import com.dmdev.oop.lesson7.Ram;
import com.dmdev.oop.lesson7.Ssd;

public class Mobile extends  Computer{

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }

    @Override
    public void load() {
        System.out.println("Я включился");
    }
}
