package com.hse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainApp {
    public static void main(String[] args) {
        new SpringApplication(MainApp.class).run(args);
    }
}
