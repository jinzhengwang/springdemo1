package com.example.springdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.example.springdemo1.mapper")
public class Springdemo1Application {

    public static void main(String[] args) {

        SpringApplication.run(Springdemo1Application.class, args);
    }

}
