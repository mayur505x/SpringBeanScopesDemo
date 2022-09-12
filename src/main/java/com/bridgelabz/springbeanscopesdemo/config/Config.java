package com.bridgelabz.springbeanscopesdemo.config;

import com.bridgelabz.springbeanscopesdemo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    public Student studBean1() {
        return new Student();
    }

    @Bean
    public Student studBean2() {
        return new Student();
    }
}
