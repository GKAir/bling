package com.zwz.bling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@MapperScan("com.zwz.bling.web.dao")
@SpringBootApplication
public class BlingApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlingApplication.class, args);
    }
}
