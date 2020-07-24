package com.offcn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class Sp01Main {

    public static void main(String[] args) {
        // SpringApplication.run(Sp01Main.class, args);

        Integer a = 100;
        Integer b = 100;

        Integer c = 127;
        Integer d = 127;

        System.out.println(a == b);
        System.out.println(c == d);

    }

}
