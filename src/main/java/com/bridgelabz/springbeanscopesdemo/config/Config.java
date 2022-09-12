package com.bridgelabz.springbeanscopesdemo.config;

import com.bridgelabz.springbeanscopesdemo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Lazy
    public Student studBean1() {
        return new Student();
    }
}
