package com.github.wendao76.service;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner, CommandLineRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner.run");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner.run");
    }
}
