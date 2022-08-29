package com.example.springdemo1.test;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@Configuration
@Data//生产get set 无参数构造/tosring/
public class userConfiger {
    public String getName() {
        return name;
    }

    @Value("${user.name}")
    private String name;
    @Value("${user.password}")
    private String password;

    public String getPassword() {
        return password;
    }
}
