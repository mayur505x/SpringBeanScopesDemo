package com.bridgelabz.springbeanscopesdemo.config;

import com.bridgelabz.springbeanscopesdemo.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Student studBean() {
        return new Student();
    }
}
