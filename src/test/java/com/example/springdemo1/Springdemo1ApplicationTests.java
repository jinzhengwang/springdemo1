package com.example.springdemo1;

import com.example.springdemo1.test.userConfiger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class Springdemo1ApplicationTests {
    @Autowired//自动装配类型匹配
    //@Qualifier("userConfiger") 指定名称
    //@Resource//名字匹配，没找到再按照类型匹配
    private userConfiger user;

    @Test
    void contextLoads() {
        //System.out.println(user.toString()+user.);

    }

}
