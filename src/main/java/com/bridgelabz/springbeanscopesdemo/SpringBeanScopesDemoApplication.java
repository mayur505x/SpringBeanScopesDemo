package com.bridgelabz.springbeanscopesdemo;

import com.bridgelabz.springbeanscopesdemo.config.Config;
import com.bridgelabz.springbeanscopesdemo.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBeanScopesDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBeanScopesDemoApplication.class, args);

        ApplicationContext con  = new AnnotationConfigApplicationContext(Config.class);

        Student s1 = con.getBean("studBean", Student.class);
        Student s2 = con.getBean("studBean", Student.class);

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
