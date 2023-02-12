package com.example.firstspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspringbootApplication {

    public static void main(String[] args) {
      ApplicationContext context= SpringApplication.run(FirstspringbootApplication.class, args);
        Alien obj= context.getBean(Alien.class);
        obj.code();
    }

}
