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

//        if (con.getBean("studBean1", Student.class) == con.getBean("studBean2", Student.class)) {
//            System.out.println("True");
//        } else {
//            System.out.println("False"); //It will print False Because it will create two different bean for Student Entity therefore two different object will be created
//        }

//        Student s1 = con.getBean("studBean", Student.class);
//        Student s2 = con.getBean("studBean", Student.class);
//
//        System.out.println(s1.hashCode()); //for prototype has code will be different
//        System.out.println(s2.hashCode()); //for prototype has code will be different
    }

}
