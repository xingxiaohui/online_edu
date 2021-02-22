package com.xxh.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.xxh")
public class EduServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(EduServiceApplication.class,args);
    }
}
