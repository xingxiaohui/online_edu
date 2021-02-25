package com.xxh.eduservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackages = "com.xxh")
public class EduServiceApplication {
    public static void main(String[] args){
        SpringApplication.run(EduServiceApplication.class,args);
    }
}
